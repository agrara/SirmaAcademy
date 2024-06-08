import java.util.*;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> formationString = new ArrayList(Arrays.asList(sc.nextLine().split(", ")));

        while (true) {

            String[] commandArray = sc.nextLine().split(" ");

            if (commandArray[0].equals("destroy")) {
                if (Integer.parseInt(commandArray[1]) < 0
                        || Integer.parseInt(commandArray[1]) > formationString.size() - 1) {
                    System.out.println("Enter valid indexes!");
                    continue;
                }
                int index = Integer.parseInt(commandArray[1]);
                formationString.remove(index);
            } else if (commandArray[0].equals("swap")) {
                if (Integer.parseInt(commandArray[1]) < 0
                        || Integer.parseInt(commandArray[1]) > formationString.size() - 1
                        || Integer.parseInt(commandArray[2]) < 0
                        || Integer.parseInt(commandArray[2]) > formationString.size() - 1) {
                    System.out.println("Enter valid indexes!");
                    continue;
                }
                String tmp = formationString.get(Integer.parseInt(commandArray[1]));
                formationString.set(Integer.parseInt(commandArray[1]),
                        formationString.get(Integer.parseInt(commandArray[2])));
                formationString.set(Integer.parseInt(commandArray[2]), tmp);
            } else if (commandArray[0].equals("add")) {
                formationString.add(commandArray[1]);
            } else if (commandArray[0].equals("center")) {
                if (formationString.size() % 2 == 0) {
                    int firstCenterIndex = formationString.size() / 2 - 1;
                    int secondCenterIndex = firstCenterIndex + 1;
                    System.out.println(
                            formationString.get(firstCenterIndex) + " " + formationString.get(secondCenterIndex));
                } else {
                    System.out.println(formationString.get(formationString.size() / 2));
                }
                continue;
            } else if (commandArray[0].equals(("end"))) {
                break;
            }
            for (String x : formationString) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

}
