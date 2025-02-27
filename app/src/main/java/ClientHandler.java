

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import IO.LineStorage;

public class ClientHandler{
    private final Socket clientSocket;
    private final LineStorage lineStorage;
    private final KWICLogger requestLogger;

    public ClientHandler(Socket socket, LineStorage lineStorage, KWICLogger requestLogger) {
        this.clientSocket = socket;
        this.lineStorage = lineStorage;
        this.requestLogger = requestLogger;
    }

    public void searchLines() {
        KWICSearcher searcher = (KWICSearcher) OptionReader.getObjectFromStr("KWICSearcher");
        
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        ) {
            String targetWord = in.readLine();
            
            if (targetWord == null){
                out.print("");
                requestLogger.logRequest(false); 
                return;
            } 

            ArrayList<String> searchedLines = searcher.SearchFile(lineStorage, targetWord);

            if(searchedLines.size() <= 0){
                out.print("");
                requestLogger.logRequest(false);
                return;
            }

            requestLogger.logRequest(true);

            for(String line : searchedLines){
                out.print(line);
            }
            
        } catch (IOException e) {
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
            }
        }
    }
}
