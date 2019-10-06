package Q5;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string =scanner.nextLine();
        String subString=scanner.nextLine();
        String replace=scanner.nextLine();
        Define05 define05 = new Define05(string,subString,replace);
        System.out.println(define05);
    }
}
