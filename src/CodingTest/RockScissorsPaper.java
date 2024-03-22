package CodingTest;

import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
           System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
           String user = sc.next();
           String[] com = {"가위","바위","보"};
           int ran = (int)(Math.random()*3);
           
           if (user.equals("그만")) {
                System.out.println("종료합니다..");
                break;
           }

           if(user.equals(com[ran])){System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 비겼습니다.");}
           else{
               if(user.equals("가위")){
                    if (com[ran].equals("바위")) {
                        System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 컴퓨터가 이겼습니다.");
                    }
                    else{
                        System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 유저가 이겼습니다.");
                    }
               }
               else if(user.equals("바위")){
                    if (com[ran].equals("보")) {
                        System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 컴퓨터가 이겼습니다.");
                    }
                    else{
                        System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 유저가 이겼습니다.");
                    }
               }
               else if(user.equals("보")){
                if (com[ran].equals("가위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 컴퓨터가 이겼습니다.");
                }
                else{
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[ran] + ", 유저가 이겼습니다.");
                }
               }

           }           
                

        
     }
    
   
    }
}
