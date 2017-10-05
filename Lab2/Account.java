import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id =0;
		balance = 1000;
		annualInterestRate = 4.50;
		dateCreated = new Date();
	}
	public Account(int i, double d) {
		id =i;
		balance = d;
		annualInterestRate = 4.50;
		dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return annualInterestRate;
	}
	public Date getDate() {
		return dateCreated;
	}
	public void setID(int i) {
		id = i;
	}
	public void setBalance(double d) {
		balance = d;
	}
	public void setInterestRate(double d) {
		annualInterestRate = d;
	}
	public double getMonthlyInterestRate() {
		return getInterestRate()/12;
	}
	public void withdraw(double amount) {
		if (amount > balance)
			System.out.println("Not Enough Money in the Account");
		else {
			setBalance(getBalance()-amount);
		}
	}
	
	public void deposit(double d) {
		setBalance(getBalance() + d);
	}
	
	public static void main(String[] args) {
		Account test = new Account();
		Account test1 = new Account(15,20000);
		
		System.out.println("Testing Constructors, Balance,ID,InterestRate,Date");
		System.out.println(test.getBalance());
		System.out.println(test.getId());
		System.out.println(test.getInterestRate());
		System.out.println(test.getDate());
		System.out.println("Testing Constructors, Balance,ID,InterestRate,Date");
		System.out.println(test1.getBalance());
		System.out.println(test1.getId());
		System.out.println(test1.getInterestRate());
		System.out.println(test1.getDate());
		
		System.out.println("Testing Deposit");
		System.out.println(test.getBalance());
		test.deposit(1000);
		System.out.println(test.getBalance());
		
		System.out.println("Testing Withdraw");
		System.out.println(test.getBalance());
		test.withdraw(200000);
		test.withdraw(500);
		System.out.println(test.getBalance());
		
		System.out.println("Testing Monthly Interest");
		System.out.println(test.getInterestRate());
		System.out.println(test.getMonthlyInterestRate());
	}
}
