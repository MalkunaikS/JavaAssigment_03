package assigment_03;

public class TestAccount {

	public static void main(String[] args) {
		
		        SavingsAccount saver1 = new SavingsAccount(2000);
		        SavingsAccount saver2 = new SavingsAccount(3000);

		        SavingsAccount.modifyInterestRate(0.03);
		        
		        System.out.println("Initial balance:");
		        System.out.println("Saver1: " + saver1.getSavingsBalance());
		        System.out.println("Saver2: " + saver2.getSavingsBalance());
		        
		        saver1.calculateMonthlyInterest();
		        saver2.calculateMonthlyInterest();
		        
		        System.out.println("\nBalances after one month 3% annual interestrate:");
		        System.out.println("Saver1: " + saver1.getSavingsBalance());
		        System.out.println("Saver2: " + saver2.getSavingsBalance());
		        
		        SavingsAccount.modifyInterestRate(0.04);
		        
		        saver1.calculateMonthlyInterest();
		        saver2.calculateMonthlyInterest();
		        
		        System.out.println("\nBalances after another month 4% annual interestrate:");
		        System.out.println("Saver1: " + saver1.getSavingsBalance());
		        System.out.println("Saver2: " + saver2.getSavingsBalance());
		    }
		

	}


