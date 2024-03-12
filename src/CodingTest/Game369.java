package CodingTest;
import java.util.Scanner;

public class Game369 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int arr[] = new int[2];
        String clap = "박수";

        while (true) {
            System.out.println("1~99 숫자를 입력하세요");
            num = sc.nextInt();

            if (num >= 1 && num <= 99) {
                arr[0] = num / 10;
                arr[1] = num % 10;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 3 == 0 && arr[i] != 0) {
                        clap = clap + "짝";
                    }
                }
                break;
            } else {
                System.out.println("다시 입력하세요");
            }
        }

        if (clap.equals("박수")) {
            clap = "박수없음";
        }

        System.out.println(clap);
        sc.close();
    }
}