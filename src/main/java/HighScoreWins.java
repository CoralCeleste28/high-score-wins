import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {

        String homeTeam;
        String visitorTeam;
        int homeScore;
        int visitorScore;
        int visitorTeamScore;
        String userInput;
        String teams;
        String scores;

        Scanner scanner = new Scanner(System.in);
        //makes a scanner named scanner that reads user input

        System.out.print("Please enter a game score: ");
        userInput = scanner.nextLine().trim();
        // userInput whatever is in the next line. It is good practice to trim
        String[] gameAndScore = userInput.split(Pattern.quote("|"));
        // Makes an array of strings named gameAndScore divided by |
        teams = gameAndScore[0].trim();
        scores = gameAndScore[1].trim();
        // names each index
        String[] teamsName = teams.split(Pattern.quote(":"));
        // makes an array of Strings named teamsName
        // splits the teams index by :
        String[] teamScores = scores.split(Pattern.quote(":"));
        // makes an array of Strings named teamsScores
        // splits scores index by :
        homeTeam = teamsName[0].trim();
        // trims the 0 index in teams name and labels it homeTeam
        visitorTeam = teamsName[1].trim();
        homeScore = Integer.parseInt(teamScores[0].trim());
        visitorScore = Integer.parseInt(teamScores[1].trim());
        // Trim, 0 index in teamScores (remember that this is a string) and convert to int
        // This is labeled visitorScore
        if (Math.max(homeScore, visitorScore) == homeScore) {
            // Remember Math.max compares two values and returns the largest one
            // if the output of Math.max is equal to homeScore
            System.out.println("Winner: " + homeTeam);
        } else { // if the output of Math.max is anything else
            System.out.println("Winner: " + visitorTeam);
        }

    }
}
