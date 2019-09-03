package IO;

import java.util.Scanner;

public class Multiply_Process {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        String num2;
        String[] arr;
        String result;

        num1 = scanner.nextInt();
        num2 = scanner.nextLine();
        arr = num2.split("");

        for(int i=arr.length; i>0; i--) {
            int value = num1*Integer.parseInt(arr[i-1]);
            System.out.println(value);
        }
    }
}
