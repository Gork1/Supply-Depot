import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner iName = new Scanner(System.in);
		System.out.println("Item Name");
		String ItemName = iName.nextLine();
		
		Scanner iCode = new Scanner(System.in);
		System.out.println("Item Code");
		String ItemCode = iCode.nextLine();
		
		Scanner iAmount = new Scanner(System.in);
		System.out.println("Amount Change");
		int ItemAmount = iAmount.nextInt();
		
		if(ItemAmount > 0) {
			System.out.println(ItemAmount + " units of " + ItemCode + " [" + ItemName + "] " + "entered the depot." );
		}
		else {
			System.out.println(ItemAmount + " units of " + ItemCode + " [" + ItemName + "] " + "left the depot." );
		}
	}
}
