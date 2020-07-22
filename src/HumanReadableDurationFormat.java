import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HumanReadableDurationFormat {


    Scanner input = new Scanner(System.in);

    public String returnHumanReadForm(){
        int seconds;

        System.out.print("Enter Second: ");
        seconds = input.nextInt();


        String result = "";
        int[] units = new int[] {31536000, 86400, 3600, 60, 1};
        String[] labels = new String[] {"year", "day", "hour", "minute", "second"};

        if (seconds == 0) return "now";

        for (int i = 0; i < 5; i++) {
            if (seconds >= units[i]) {
                int q = seconds / units[i];
                seconds = seconds % units[i];
                result += (result.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                        + q + " " + labels[i] + (q > 1 ? "s" : "");
            }
        }
        return result;
    }
}
