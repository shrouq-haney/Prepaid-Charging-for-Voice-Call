import java.time.LocalDateTime;


public class TestCDR {
    public static void main(String[] args) {
        String msisdn = "01123456789";
        LocalDateTime start = LocalDateTime.now().minusMinutes(3); // من 3 دقايق
        LocalDateTime end = LocalDateTime.now(); // دلوقتي
        double cost = 5.0 * 3;
        double balanceAfter = 100.0 - cost;

        CDRWriter.writeCDR(msisdn, start, end, "Normal call clearing", cost, balanceAfter);
    }
}

