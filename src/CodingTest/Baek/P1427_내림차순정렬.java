package CodingTest.Baek;

import java.util.Scanner;

public class P1427_내림차순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] s = str.split("");
        int[] nums = new int[s.length];
        for(int i = 0; i < s.length; i++){

          nums[i] = Integer.parseInt(s[i]);

        }

        int temp;
        for(int i = 0; i < nums.length; i++){
            int max = Integer.MIN_VALUE;
            int max_index = 0;
            for(int j = i; j < nums.length; j++){

                if(nums[j] > max){

                    max = nums[j];
                    max_index = j;
                }

            }

            temp = nums[max_index];
            nums[max_index] = nums[i];
            nums[i] = temp;

        }

        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    
}
