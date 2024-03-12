package CodingTest;


public class ForEachEx {
    
        static int[] intArray(){
            int[] temp = new int[4];
    
            for(int i=0; i<temp.length; i++){
                temp[i] = i*10;
            }
    
            return temp;
        } 
    
public static void main(String[] args) {
        int[] n ={1,2,10,4,5};
        int sum = 0;
        for(int i : n){
            System.out.print(i + " ");
            sum += i;    
        }
        System.out.println(sum);

        String [] fruits = {"사과","바나나","체리","딸기"};
        for(String i : fruits){
            System.out.println(i+ " ");
        }

        int intArray[] = intArray();

        for (int i : intArray) {
            System.out.println(i+ " ");
        }
    }
}