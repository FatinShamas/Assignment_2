import java.util.*;
public class Assignment_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String name,TV;
		int age,price,item,cust;
		char gender;
		double discount, total;
		
		System.out.println("***********Welcome To Our TV's Shop**********************");
		System.out.println();
		
		System.out.println("***********Now, Our Shop Have A Blast Promosi!***********");
		System.out.println();

		//FOR LOOP
		for(int i=0; i < 2;i++) {
		System.out.print("Enter name of the two customer that come into the shop: ");
		name = in.next();
	    }
		
		//DO-WHILE LOOP
		int x =1;
		
		do {
		System.out.print("Enter the age of the customer:"+x+ ".");
		age = in.nextInt();
		x++;
		}
		while(x<3);
		

		System.out.print("Enter gender of the customer:" );
		gender = in.next().charAt(0);
		
		System.out.println();
		
		//REPETITION STRUCTURE (IF/ELSE) FOR GENDER
		if(gender=='F') {
			System.out.println("You can claim item under RM50, at the Watson and Guardian shop. After you buy with our product. Don't miss it!");
		}
		else
			if(gender=='M') {
				System.out.println("You can claim item under RM50, at the electric shop. After you buy with our product. Don't miss it!");
				
			}
			else
				System.out.println("None");
		
		
		System.out.println();
		
		System.out.print("Enter the product/services: ");
		String product = in.next();
		
		if(product.equals("QLED")) {
			System.out.println("The price is RM987");
		}         
		if(product.equals("OLED")) {
			System.out.println("The price is RM1,600");
		}
			else
				if(product.equals("LCD")) {
					System.out.println("The price is RM2,260");
				}
				else
					if(product.equals("DLP")) {
						System.out.println("The price is RM1,940");
					}
					else
						if(product.equals("Plasma")) {
							System.out.println("The price is RM850");
						}
						else
							if(product.equals("Direct_TV")) {
								System.out.println("The price is RM1,200");
							}
							else
								System.out.println("None");
	
							
							
		System.out.println();
		
	    //how many item that customer purchase
		System.out.print("Enter how many item purchase: ");
		item = in.nextInt();
		
		System.out.println();
		
		//calculate the total price
		System.out.print("Enter the price given is RM ");
		price = in.nextInt();
		
		System.out.println();
		
		total = price * item;
		System.out.println("The total price: RM" +total);
		
		//discount
		System.out.println();
		if(total>1000) {
			discount = total * 0.1;
		}
		else
			discount = total * 0.2;
		
		System.out.println("Discount received: RM" +discount);
		System.out.println("Price to be paid on the product after discout: RM" +(total-discount));
		
		System.out.println();
		
		
		//WHILE LOOP
		System.out.println("Before you go back, let's pick one that you like and go redeem your coupon! Interesting isn't it!?");
		String [] lucky = {"KFC", "MCDonald", "Subway"};
		
		int index =0;
		while (index<lucky.length) {
			System.out.println(lucky[index]);
			index++;
		}
		System.out.println();
		System.out.println("***************THANK YOU MY BELOVED CUSTOMER, HOPE TO SEE YOU AGAIN!***************");
		
		}
	}

		
		



		
		