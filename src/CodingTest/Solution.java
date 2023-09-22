package CodingTest;
import java.util.*;
class Solution {
       public static Integer[] func(Integer[] num, int n) {
      Arrays.sort(num, new Comparator<Integer>() {
         public int compare(Integer a, Integer b) {
            int x = Math.abs(n-a);
            int y = Math.abs(n-b);
            if(x>y) return -1;
            else if(x==y) return a.compareTo(b);
            else return 1;
            
         }
      });
      
      return num;
   }
    public int[] solution(int[] numlist, int n) {
        Integer numlist_i[] = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
         
      func(numlist_i,n);

      for(int i=0; i<numlist_i.length; i++) {
         System.out.print(numlist_i[i]+" ");
      }
      List<Integer> list = Arrays.asList(numlist_i);
      Collections.reverse(list);
      Integer rev[] = list.toArray(numlist_i);
      
      int[] answer = Arrays.stream(numlist_i).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}