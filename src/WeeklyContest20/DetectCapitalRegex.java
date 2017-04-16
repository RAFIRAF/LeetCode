package WeeklyContest20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-02-19.
 */
public class DetectCapitalRegex {
    public static boolean allUpper(String s){
//        String regEx = "([A-Z]+)";
//        Pattern pattern = Pattern.compile(regEx);
//        Matcher matcher = pattern.matcher(s);
//        return matcher.matches();
        return s.matches("([A-Z]+)");
    };
    public static boolean onlyFirstUpper(String s){
        String regEx = "([A-Z][a-z]+)";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    };
    public static boolean allLower(String s){
        String regEx = "([a-z]+)";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    };
    public static boolean detectCapitalUse(String s){
        return allLower(s) || allUpper(s) || onlyFirstUpper(s);
    }
    public static void main(String[] args){
        System.out.println(allUpper("RAFIRAF"));
        System.out.println(onlyFirstUpper("Rafiraf"));
        System.out.println(allLower("rafiraf"));
    }
}
