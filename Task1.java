import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
import java.lang.Math;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // represents the initial count
        int m = Integer.parseInt(sc.nextLine()); // represents the increase of the count
        int h = Integer.parseInt(sc.nextLine()); // represents the number of hours
        int totalOrcs = n;

        for (int hour = 1; hour < h; hour++) {
            totalOrcs += n + hour * m;
        }

        System.out.println(totalOrcs);

    }

}