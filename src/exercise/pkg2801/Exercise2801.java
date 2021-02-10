
package exercise.pkg2801;

import java.util.Arrays;



public class Exercise2801 {
    public static void main(String[] args){
    int[] grade = {25,34,37,45,51,64,78,40,74,34};
    
    calcAvg(grade);
    calcMax(grade);
    }
    public static void calcAvg(int[] input) 
    {
        int length = input.length;
        
        int sum = 0;
        
        for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
        double average = sum / length;
		
	System.out.println("Average of grades : "+average);
//       
    }
    public static void calcMax(int[] input2){
        
        int max = Arrays.stream(input2).max().getAsInt(); 
        System.out.println("Largest number in array is " +max);
//        
    }
      
            
            
}
