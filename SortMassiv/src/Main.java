
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите строки через запятую: ");
                String input = scanner.nextLine();
                String[] array = input.split(", ");
                String[] filteredArray = filterShortStrings(array);
                for (String s : filteredArray) {
                    System.out.print("\"" + s + "\" ");
                }
            }

            public static String[] filterShortStrings(String[] arr) {
                int count = 0;
                for (String s : arr) {
                    if (s.length() <= 3) {
                        count++;
                    }
                }

                String[] result = new String[count];
                int index = 0;
                for (String s : arr) {
                    if (s.length() <= 3) {
                        result[index] = s;
                        index++;
                    }
                }

                return result;
            }
        }
