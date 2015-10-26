import java.util.Random;

public class Dice {

	
	
	public static void main(String[] args) {
		
		
	
	    int first;
	    int second;
	    boolean exit=true;
	    while(exit){
		Random rnd = new Random();
		first= 1+ rnd.nextInt(6);
		System.out.println("Roll 1 :"+first);
		second=1+rnd.nextInt(6);
		System.out.println("Roll 2 :"+second);
		int number=first+second;
		System.out.println("The Total value is :"+number);
		if (first == second){
			exit=false;
		}
	    }

	}

}
