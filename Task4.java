import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
import java.lang.Math;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(", ");
        String searchString = sc.nextLine();

        int firstOccuranceIndex = 0;
        int lastOccuranceIndex = 0;
        boolean found = false;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals(searchString)) {
                firstOccuranceIndex = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = firstOccuranceIndex; i < inputArray.length; i++) {
                if (inputArray[i].equals(searchString)) {
                    lastOccuranceIndex = i;
                }
            }
            System.out.println("First Occurrence: " + firstOccuranceIndex);
            System.out.println("Last Occurrence: " + lastOccuranceIndex);

        } else {
            System.out.println("Record not found");
        }

    }

}