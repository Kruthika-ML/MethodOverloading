public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        int newScore1 = calculateScore(75);
        System.out.println("New Score1 is " + newScore1);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " has scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name and no score");
        return 0;
    }

}