import java.time.LocalDateTime;

public class Clock {
    public static void main(String[] args) {

        int second = 99;

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int lastsecond = second;
            second = now.getSecond();

            if (lastsecond != second) {
                String format = "%d:%d %d";
                String output = String.format(format, hour, minute, second);
                System.out.println(output);

            }
        }
    }
}