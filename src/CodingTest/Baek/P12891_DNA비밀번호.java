package CodingTest.Baek;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class P12891_DNA비밀번호 {
    static int cnt;
    static int myarr[];
    static int goal[]; 
    
    static void Add(char c){

        switch (c) {
            case 'A':
                myarr[0]++;
                if(myarr[0] == goal[0]){
                    cnt++;
                }    
                break;
                case 'C':
                myarr[1]++;
                if(myarr[1] == goal[1]){
                    cnt++;
                }    
                break;
                case 'G':
                myarr[2]++;
                if(myarr[2] == goal[2]){
                    cnt++;
                }    
                break;
                case 'T':
                myarr[3]++;
                if(myarr[3] == goal[3]){
                    cnt++;
                }    
                break;

        }

    }
    static void remove(char c){

        switch (c) {
            case 'A':
                
                if(myarr[0] == goal[0]){
                    cnt--;
                }    
                myarr[0]--;
                break;

                case 'C':
                
                if(myarr[1] == goal[1]){
                    cnt--;
                }    
                myarr[1]--;
                break;

                case 'G':
                
                if(myarr[2] == goal[2]){
                    cnt--;
                }    
                myarr[2]--;
                break;
                case 'T':
                
                if(myarr[3] == goal[3]){
                    cnt--;
                }    
                myarr[3]--;
                break;

        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();

        char A[] = new char[S];
        int result = 0;
        
        A = sc.next().toCharArray();
        myarr = new int[4];
        goal = new int[4];
        cnt = 0;
        for(int i = 0; i < 4; i++){

            goal[i] = sc.nextInt();
            if(goal[i] == 0){
                cnt++;
            }
        }

        for(int i = 0 ; i < P; i++){
            Add(A[i]);
        }
        if(cnt == 4){
            result++;
        }

        for(int i = P; i < S; i++){
            int j = i - P;
            Add(A[i]);
            remove(A[j]);
            if(cnt == 4){
                result++;
            }
    

        }
        
        System.out.println(result);
        sc.close();
    }
}