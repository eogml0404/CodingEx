package CodingTest;

import java.util.Scanner;

public class KorEng {
    public static void main(String[] args){
        String eng[] = {"student","love","java","happy","future"};
        String kor[] = {"학생","사랑","자바","행복한","미래"};

        String ans;
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            String result = "";
            System.out.println("영어 단어를 입력하세요 >>");

            ans = sc.next();
            
            if(ans.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }

            for(int i = 0; i<eng.length; i++){
                if(ans.equals(eng[i])){
                    
                    result = kor[i];
                    break;
                }

            }

            if(result != ""){
                System.out.println(result);
            }
            else{
                System.out.println("그런 영어 단어가 없습니다.");
            }

        }
        sc.close();
    }

}
