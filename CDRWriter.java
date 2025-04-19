import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;




public class CDRWriter {

    public static void writeCDR(String msisdn, LocalDateTime startTime, LocalDateTime endTime, String result, double cost, double balanceAfter) {
        // احسب عدد الدقايق من startTime لـ endTime
        long duration = Duration.between(startTime, endTime).toMinutes();

        // شكل السطر اللي هنكتبه
        String cdrLine = String.format(
                "%s,%s,%s,%d,%s,%.2f,%.2f",
                msisdn,
                startTime.toString(),
                endTime.toString(),
                duration,
                result,
                cost,
                balanceAfter
        );

        // نكتبه في الملف
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./calls/calls.txt", true))) {
            writer.write(cdrLine);
            writer.newLine();
            System.out.println("CDR saved successfully: " + cdrLine);
        } catch (IOException e) {
            System.err.println("Error writing CDR: " + e.getMessage());
        }
    }
}

