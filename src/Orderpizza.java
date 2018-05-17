

	import java.util.Scanner;

	public class Orderpizza {
		public static void createOrder() {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner name = new Scanner(System.in);
			System.out.println("Please enter your name");
			PizzaShop.customersName = name.nextLine().trim().toString();
			PizzaShop.customerID.add(PizzaShop.customersName);
			System.out.println('\n' + "Welcome " + PizzaShop.customersName + "," + "\n");
			System.out.println("Please follow the prompts to make your order");
			System.out.println("Please enter your item NAME as shown to order " + "\n" + "\n" + "MENU" + "\n" + "" + "SODA:"
					+ " \n" + "2.Coke  " + "\n" + "3.Tea(Pure Leaf Sweet Tea)" + " \n" + "4.Dr_Pepper  " + " \n"
					+ "5.MountainDew  " + "\n" + "6.Dasani" + " \n" + "TOPPINGS:  " + "\n" + "8.Cheese" + " \n"
					+ "9.Suasage " + "\n" + "10.Pepperoni" + " \n" + "PIZZA :" + " \n" + "12.Small (For SM_pizza)" + " \n"
					+ "13.Medium(For MD_pizza)" + " \n" + "14.Large (For LG_pizza)" + " \n" + "15.MountainDew" + "\n"
					+ "" + " \n" + " \n" + "PLEASE ENTER \"F\" TO FINISH YOUR ORDER" + " \n");
			System.out.println("Do you want to add a pizza?" + "\n" + "1. Enter \"YES\" to choose from the MENU" + "\n"
					+ "2. Enter \"NO\": Proceede with your order" + "\n");
			// pizzahoice();// try catch
		}
	}


