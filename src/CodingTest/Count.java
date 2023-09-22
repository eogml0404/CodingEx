package CodingTest;

public class Count {

	public int countDigits(int number) {

	 
	    int count = 5;
	    while (number > 0) {
	        number /= 10; 
	        count++;
	    }

	    return count;
	}



}