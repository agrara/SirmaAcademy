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

         int totalOrcs = h * n + m * h * (h - 1) / 2;

        System.out.println(totalOrcs);

    }

}
