import java.util.Scanner;
public class d3 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Провери, дали числото/а се дели/ят на 3 и разбери колко е, ако се дели");
		System.out.println("Въведи числото а: ");
		long a= input.nextLong();
		if (a%3==0) {
			System.out.println("Числото " + a + " се дели на 3 и е: ");
		System.out.println(a/3);;}
		else 
			System.out.println("Числото "+ a+ " не се дели на 3!");
		input.close();
		

	}

}

