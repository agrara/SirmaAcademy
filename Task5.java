import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpuString = sc.nextLine();
        int countDiscl = 0;

        Stack<Character> techs = new Stack<Character>();

        for (int i = 0; i < inpuString.length(); i++) {
            if (techs.empty()) {
                techs.push(inpuString.charAt(i));
                continue;
            }
            if (inpuString.charAt(i) == ')') {
                if (techs.peek() == '(') {
                    techs.pop();
                    continue;
                } else {
                    break;
                }
            } else if (inpuString.charAt(i) == '}') {
                if (techs.peek() == '{') {
                    techs.pop();
                    continue;
                } else {
                    break;
                }
            } else if (inpuString.charAt(i) == '!') {
                if (countDiscl != 0) {
                    if (techs.peek() == '!') {
                        techs.pop();
                        countDiscl = 0;
                        continue;
                    } else {
                        break;
                    }
                } else {
                    techs.push(inpuString.charAt(i));
                    countDiscl = 1;
                    continue;
                }
            } else {
                techs.push(inpuString.charAt(i));
            }
        }

        if (techs.empty()) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }

    }

}
