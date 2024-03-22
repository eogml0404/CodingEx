package CodingTest;

import java.util.Scanner;

class Phone{
    String name;
    String tell;

    public Phone(String name, String tell){
        this.name = name;
        this.tell = tell;

    }

}

public class PhoneManager {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("인원수>>");
        int num = sc.nextInt();
        Phone p[] = new Phone[num];

        for(int i=0;i<p.length;i++){
            System.out.println("이름과 전화번호");
            p[i] = new Phone(sc.next(), sc.next());
            
        }
        System.out.println("저장되었습니다...");

        while (true) {
            System.out.println("검색할 이름>>");
            String SearchName = sc.next();
            if (SearchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }


            for(int i=0; i< num; i++){
                if(SearchName.equals(p[i].name)) {
                    System.out.println(p[i].name + "의 번호는 " + p[i].tell + "입니다.");
                    break;
                }
                else if(!(SearchName.equals(p[i].name)) && (i == (num-1)) ){
                    System.out.println(SearchName + "이 없습니다.");
                }
            }

        }
        
    }
   
}
