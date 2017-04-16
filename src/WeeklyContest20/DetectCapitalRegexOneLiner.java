package WeeklyContest20;

/**
 * Created by Rafal on 02017-02-19.
 */
public class DetectCapitalRegexOneLiner {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
    public static void main(String[] args){
        System.out.println(
                new DetectCapitalRegexOneLiner().detectCapitalUse("RAFIRAF")
        );
        System.out.println(
                new DetectCapitalRegexOneLiner().detectCapitalUse("Rafiraf")
        );
        System.out.println(
                new DetectCapitalRegexOneLiner().detectCapitalUse("rafiraf")
        );
        System.out.println(
                new DetectCapitalRegexOneLiner().detectCapitalUse("RAfiraf")
        );
        System.out.println(
                new DetectCapitalRegexOneLiner().detectCapitalUse("RaFiRaF")
        );
    }
}
