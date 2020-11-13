package lab11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main{

    private static String GetString(String message)
    {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;

    }

    private static boolean CheckString(String string)
    {
        Pattern patternURL = Pattern.compile("(https?:\\/\\/)?([\\D\\.]+)\\.([a-z]{2,6}\\.?)(\\/[\\w\\.]*)*\\/?");
        Matcher matcherURL = patternURL.matcher(string);
        return matcherURL.matches();
    }

    public static void main(String[] args) {
        String string = GetString("Enter string: ");
        if(CheckString(string))
        {
            System.out.println("String is right URL.");
        }
        else
        {
            System.out.println("String isn't right URL.");
        }
    }
}