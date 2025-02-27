import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;

public class KWICLogger {
    @SuppressWarnings("FieldMayBeFinal")
    private AtomicInteger totalRequests = new AtomicInteger(0);
    @SuppressWarnings("FieldMayBeFinal")
    private AtomicInteger successfulRequests = new AtomicInteger(0);
    private final String logFile = "log.txt";

    public void logRequest(boolean success) {
        int total = totalRequests.incrementAndGet();
        int successful = success ? successfulRequests.incrementAndGet() : successfulRequests.get();
        PrintStream out;

        try {
            out = new PrintStream(new FileOutputStream(logFile));
            System.setOut(out);
        } catch (FileNotFoundException e) {
        }

        System.out.println("Total requests: " + total);
        System.out.println("Successful requests: " + successful);

        synchronized (this) {
            System.out.println("Total requests: " + total);
            System.out.println("Successful requests: " + successful);
        }
    }
}