package Package1;

import java.util.Scanner;

public class NewProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Howmany new products do you want to produce? ");
		int numbers = scanner.nextInt();
		scanner.nextLine();
		
		String[] productNames = new String[numbers];
		int[] productPrices = new int[numbers];
		
		for(int i=0; i<numbers; i++) {
			System.out.println("Name of product "+(i+1)+" ?");
			String name= scanner.nextLine();
			
			productNames[i] = name;
			
		 for(int j=i-1; j<i; j++){
			System.out.println("The price of product "+(i+1)+" (in Dollars)?");
	    	Integer price = scanner.nextInt();
	    	scanner.nextLine();
		
	    	productPrices[i] = price;
	    	}
		}
		System.out.println("The names and prices of new products");
		
		for(int i=0; i<numbers; i++) {
			System.out.print(productNames[i]+"  "+productPrices[i]);
			System.out.println("$");
		}
		
		}

}
