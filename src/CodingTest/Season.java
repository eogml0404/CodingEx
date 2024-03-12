package CodingTest;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        
        System.out.println("몇 월이에요?");

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
        
            default:
                System.out.println("겨울이 아닙니다.");
                break;
        }

        sc.close();

    }

}
