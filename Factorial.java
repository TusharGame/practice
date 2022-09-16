package method;

import java.util.scanner;

public class Factorial {
public static void main(String []args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter you number : ");

int no=sc.nextIn();

	Factorial f1=new Factorial();
	f1.findFactorial(5);
}
public void findFactorial(int no) {
	int fact=1; 
	for(int i=1; i<=no;i++) {
		fact=fact*i;
	}
	System.out.print(fact);
//change code
}
}
