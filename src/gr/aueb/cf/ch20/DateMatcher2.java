package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher2 {
    public static void main(String[] args) {
        String date = "06/21/2024 07/21/2024"; // mm/dd/yyyy

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {
            String usDate = "";
            for (int i = 1; i <= matcher.groupCount(); i++ ) {
                //System.out.println(matcher.group(i) + " ");

                if (i != 3) {
                    usDate += matcher.group(i) + "/";
                } else {
                    usDate += matcher.group(i);
                }
            }
            System.out.println(usDate);
           //System.out.println();
        }
    }
}
