import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
import java.lang.Math;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        String outpuString = "";

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i) - n;
            outpuString += (char) ascii;
        }

        System.out.println(outpuString);

    }

}
