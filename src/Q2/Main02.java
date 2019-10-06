package Q2;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        int index = scanner.nextInt();
        Define02 define = new Define02(str,index);
        System.out.println(define);
    }
}
