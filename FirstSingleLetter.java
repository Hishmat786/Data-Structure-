import java.util.Scanner;

public class FirstSingleLetter {

    public static char firstSingleLetter(char text[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (text[i] == text[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return text[i];
            } else {
                count = 0;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Letter and No Space: ");
        String str = sc.nextLine();
        int size = str.length();
        char[] text = new char[size];
        for (int i = 0; i < size; i++) {
            text[i] = str.charAt(i);
        }
        if (firstSingleLetter(text, size) == ' ') {
            System.out.println("No Character in text is Single!");
        } else {
            System.out.print("Single Character in text is : " + firstSingleLetter(text, size));
        }
    }
}
