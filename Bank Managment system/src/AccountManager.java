import java.util.Scanner;
public class AccountManager {
	
	Scanner Sc=new Scanner(System.in);
	public Account[] create(int n)
	{
		
		Account arr[]=new Account[n];
		for(int i=0;i<n;i++)
		{ 
			System.out.println("------------------ New Account---------------------------");
			System.out.println("Enter Account Number:");
			int acNo=Sc.nextInt();
			System.out.println("Enter Account type  :");
			String acType=Sc.next();
			System.out.println("Enter Account Holder Name:");
			String acHolder=Sc.next();
			System.out.println("Enter Account Balance :");
			double acBalance=Sc.nextDouble();
			Account obj=new Account(acNo, acType, acHolder, acBalance);
			arr[i]=obj;
		}
		 
	return arr;
		
		
	}
	
	public void display(Account obj[])
	{
		for(int i=0;i<obj.length;i++)
		{
			  
			System.out.println("------------------ Account - "+(i+1)+"---------------------------");
			System.out.println("Account Number :"+obj[i].getAcNo());
			System.out.println("Account type  :"+obj[i].getAcType());
			System.out.println("Account Holder Name :"+obj[i].getAcHolder());
			System.out.println("Account Balance :"+obj[i].getAcBalance());
		}
		// searching book
		//sorting book by id hint -----------if condition
		
	System.out.println("----------Book Price Greater Than 2000 Rs.-----------------");		
			for(int i=0;i<obj.length;i++)
			{
				if(obj[i].getAcBalance()>20000) 
				{
					
				
					System.out.println("---------------------------------------------");
					System.out.println("Account Number :"+obj[i].getAcNo());
					System.out.println("Account type  :"+obj[i].getAcType());
					System.out.println("Account Holder Name :"+obj[i].getAcHolder());
					System.out.println("Account Balance :"+obj[i].getAcBalance());
				}
			}
	}
//------------------ Searching ---------------------------------------------------------
	public void search(Account obj[],int n)
	{
		int flag=0;
		int no=0;
		System.out.println("Enter Book Id Which you want to search:");
		int key=Sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(obj[i].getAcNo()==key)
			{
				flag=1;
				 no=i;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("---------- Account Found ----------------");
			System.out.println("Account Number :"+obj[no].getAcNo());
			System.out.println("Account type  :"+obj[no].getAcType());
			System.out.println("Account Holder Name :"+obj[no].getAcHolder());
			System.out.println("Account Balance :"+obj[no].getAcBalance());
		}
		else
			System.out.println("Book Not Found !");
		
	}

}
