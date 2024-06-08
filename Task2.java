import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] votesArray = sc.nextLine().split(", ");

        int yesVotes = 0;
        int noVotes = 0;
        int abstainVotes = 0;

        for (String vote : votesArray) {
            if (vote.equals("Yes")) {
                yesVotes++;
            } else if (vote.equals("No")) {
                noVotes++;
            } else if (vote.equals("Abstain")) {
                abstainVotes++;
            }
        }

        if (noVotes > yesVotes && noVotes > abstainVotes) {
            System.out.println("No");
        } else if (abstainVotes > yesVotes && abstainVotes > noVotes) {
            System.out.println("Abstain");
        } else if (noVotes > yesVotes && noVotes == abstainVotes) {
            System.out.println("Tie");
        } else if (yesVotes == noVotes || yesVotes == abstainVotes) {
            System.out.println("Tie");
        } else {
            System.out.println("Yes");
        }

    }

}