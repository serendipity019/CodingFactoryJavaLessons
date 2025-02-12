package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordAssertion {
    public static void main(String[] args) {
        String pass = "AUEBa!!2025";

        /* One classic pattern to check if one password is strong */
        Pattern pattern = Pattern.compile("^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*()]).{8,}$");
        //We make match only after .{8,} the others is just for assertion no to match.
        Matcher matcher = pattern.matcher(pass);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
