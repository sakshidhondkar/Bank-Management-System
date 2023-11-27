import java.util.Scanner;
import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManager m1 =new AccountManager();
		 
		 Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number Of Accounts:");
		int n =sc.nextInt(); 
		Account barr[]=m1.create(n);
		m1.display(barr);
		m1.search(barr, n);
		m1.sorting(barr, n); 

	}

}
