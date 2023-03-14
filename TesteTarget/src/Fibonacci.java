public class Fibonacci {

	    public static void main(String[] args){
	        int num1 = 1, num2 = 0;
	        int num3 = 0;
	        
	        System.out.println(num2);
	        System.out.println(num1);
	        
	        for(int i = 0; i <= 10; i++){
	        	num3 = num1;
	            num1 += num2;
	            num2 = num3;
	            
	            
	            System.out.println(num1);
	            if(num2 == num3) 
	            	System.out.println("E fibonacci");
	        } System.out.println("Nao e Fibonacci");

	    }	    
}