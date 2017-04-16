package WeeklyContest20;

/**
 * Created by Rafal on 02017-02-19.
 */
public class DetectCapital {
    private static char[] upperCases = {'Q','W','E','R','T','Y','U','I','O','P',
                         'A','S','D','F','G','H','J','K','L',
                         'Z','X','C','V','B','N','M'};
    public static boolean detectCapitalUse(String s){
        return onlyFirstUpper(s) || allUpper(s, 0) || allLower(s, 0);

    }
    public static boolean isUpper(char c){
        boolean x = false;
        for (int i = 0; i < upperCases.length; i++){
            if (c == upperCases[i]){
                x = true;
                break;
            }
        }
        return x;
    }
    public static boolean isLower(char c){
        return ! isUpper(c);
    }
    public static boolean allLower(String s, int startIndex){
        boolean x = true;
        for (int i = startIndex; i < s.length(); i++){
            if (isUpper(s.charAt(i))){
                x = false;
                break;
            }
        }
        return x;
    }
    public static boolean allUpper(String s, int startIndex){
        boolean x = true;
        for (int i = startIndex; i < s.length(); i++){
            if (isLower(s.charAt(i))){
                x = false;
                break;
            }
        }
        return x;
    }
    public static boolean onlyFirstUpper(String s){
        return isUpper(s.charAt(0)) && allLower(s, 1);
    }
    public static void main(String[] args){
        System.out.println("rafiraf "+detectCapitalUse("rafiraf"));
        System.out.println("Rafiraf "+detectCapitalUse("Rafiraf"));
        System.out.println("RAFIRAF "+detectCapitalUse("RAFIRAF"));
        System.out.println("RafiraF "+detectCapitalUse("RafiraF"));
        System.out.println("rAFIRAF "+detectCapitalUse("rAFIRAF"));
    }
}
