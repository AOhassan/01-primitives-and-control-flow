import java.time.LocalDateTime;

public class Clock {
    public static void main(String[] args) {

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            if (second != second) {
                String format = "%d:%d %d";
                String output = String.format(format, hour, minute, second);
                System.out.println(output);
            }
        }
    }
}