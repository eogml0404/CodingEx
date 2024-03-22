package CodingTest;

import java.util.Scanner;

class Player{
    String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class GamblingGame {

    public static void main(String[] args) {
        Player[] players = new Player[2];
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for(int i = 0; i < 2; i++) {
            System.out.print("Player " + (i+1) + " 이름을 입력하세요: ");
            players[i] = new Player(sc.next());
        }

        int round = 0;
        while (true) {
            round++;
            System.out.println("Round " + round);
            for(int i = 0; i < 3; i++){
                nums[i] = (int)(Math.random() * 3);
                System.out.print(nums[i] + "\t");
            }
            System.out.println();

            if(nums[0] == nums[1] && nums[1] == nums[2]){
                System.out.println(players[(round - 1) % 2].name + " 씨 승리하셨습니다.");
                break;
            }
            System.out.println("다음 라운드로 넘어가려면 Enter를 누르세요.");
            sc.nextLine(); // 버퍼 비우기
            sc.nextLine(); // Enter 대기
        }

        sc.close();
    }
}