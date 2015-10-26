import java.util.Scanner;

public class Dumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numb1,numb2,numb3,numb4;
		Scanner input = new Scanner(System.in);
		System.out.print("what is your first number?");		
		numb1=input.nextFloat();
		System.out.print("what is your second number?");
		numb2=input.nextFloat();
		System.out.print("what is your third number?");
		numb3=input.nextFloat();
		numb4=numb1+numb2+numb3;
		float numb5=numb4/2;
		System.out.println("("+numb1+"+"+numb2+"+"+numb3+")"+" / 2"+" is.. "+numb5);
		
 input.close();
	}

}
