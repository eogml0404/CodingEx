package CodingTest.Baek;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        
        StringBuffer sb = new StringBuffer();
        int num = 1;
        boolean result = true;
        
        for(int i = 0; i < arr.length; i++){

            if(arr[i]>=num){

                while(arr[i]>=num){
                    st.push(num++);
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");

            }
            else{

                int n = st.pop();
                if(n > arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    sb.append("-\n");
                }

            }


        }

       
        if(result){System.out.println(sb.toString()); }

        sc.close();

    }
   

}
