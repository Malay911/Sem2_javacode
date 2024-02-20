import java.util.Scanner;

public class lab5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }

            for (char ch:sentence.toCharArray()) {
                switch (Character.toLowerCase(ch)) {
                    case    'a':
                        totalA++;
                        break;
                    case 'e':
                        totalE++;
                        break;
                    case 'i':
                        totalI++;
                        break;
                    case 'o':
                        totalO++;
                        break;
                    case 'u':
                        totalU++;
                        break;
                }
            }
        }
        System.out.println("Total counts-A:"+totalA+",E:"+totalE+",I:"+totalI+
                ",O:"+totalO+",U:"+totalU);
    }
}