

	import java.util.ArrayList;
	import java.util.Scanner;

	public class PizzaShop {
		static String customersName;
		static double PureLeafSweetTea;
		static double Coke;
		static double Dasani;
		static double MountainDew;
		double extraCheese;
		static double Dr_Pepper;
		static double suasage;
		static double pepperoni;
		static double LG_pizza;
		static double SM_pizza;
		static double MD_pizza;
		static String choice;
		static ArrayList<Double> totalAmount = new ArrayList<Double>();
		static ArrayList<Double> totalAmount2 = new ArrayList<Double>();
		static ArrayList<String> receipt2 = new ArrayList<String>();
		static ArrayList<String> receipt = new ArrayList<String>();
		static ArrayList<String> customerID = new ArrayList<String>();
		static ArrayList<String> customerID2 = new ArrayList<String>();
		static int order = 1;

		private static int orderAgain;
		private static double cheese;

		static Order coke = new Order();
		static Order Mountain_Dew = new Order();
		static Order dasani = new Order();
		static Order Toppings = new Order();
		static Order pizzaSmall = new Order();
		static Order pizzaMedium = new Order();
		Order pizzaLage = new Order();
		// CONTINUE FOR CHESSE AND OTHER ******SAME (ALL)CHANGES IN MANU 2 LOL

		public static void main(String[] args) {
			// TODO Auto-generated method stub


			coke.setItem("Coke = 1.99");//CASE COMPLETED SEE *********************
			coke.setPrice(1.99);

			Mountain_Dew.setItem("Mountain_Dew = 1.99");//CASE COMPLETED. SEE CASE**********************
			Mountain_Dew.setPrice(1.99);

			pizzaSmall.setSize("Small Pizza = 1.99");// complete case statement below
	        pizzaSmall.setPrice(1.99);

	        ///	CONTINUE FOR CHESSE AND OTHER ( TWO STATEMENTS FOR EACH)********************
			// pizzaLarge.setSize("Large Pizza = 1.99");
		
			// dasani.setItem("Dasani = 1.99");

			Orderpizza.createOrder();// initiating order
			menu();
			orderAmount();// Total bill
			displayOrders();// print receipt
		}

		private static void menu() {
			// TODO Auto-generated method stub
			do {
				@SuppressWarnings("resource")
				Scanner item = new Scanner(System.in);
				choice = item.nextLine().toLowerCase().trim().toString();

				switch (choice) {
				case "coke":
					coke.setPrice(1.99);
					System.out.println(coke.getItem());
					totalAmount.add(coke.getPrice());
					receipt.add(coke.getItem());
					break;
				case "mountaindew":
					MountainDew = 1.99;
					System.out.println(Mountain_Dew.getItem());
					totalAmount.add(Mountain_Dew.getPrice());
					receipt.add(Mountain_Dew.getItem());
					break;
//					CONTINUE FOR CHESSE AND OTHER******************
				case "suasage":
					suasage = 1.99;
					System.out.println("Toppings:" + "\n" + "Suasage = 1.99" + "\n");
					totalAmount.add(suasage);
					receipt.add("Toppings:" + "\n" + "Suasage = 1.99");
					System.out.println("Do you want to add a soda ?" + "\n" + "1.OK: Choose from the menue" + "\n"
							+ " (2) NO: Proceede with your order" + "\n");
					break;
				case "cheese":
					cheese = 1.99;
					System.out.println("Toppings:" + "\n" + "cheese = 1.99" + "\n");
					totalAmount.add(cheese);
					receipt.add("Toppings:" + "\n" + "Cheese = 1.99");
					System.out.println("Do you want to add a soda ?" + "\n" + "1.Enter \"OK\": Choose from the menue" + "\n"
							+ "(2)Enter \"NO\": Proceede with your order" + "\n");
					break;
				case "pepperoni":
					pepperoni = 1.99;
					System.out.println("Toppings:" + "\n" + "cheese = 1.99" + "\n");
					totalAmount.add(pepperoni);
					receipt.add("Toppings:" + "\n" + "pepperoni = 1.99");
					System.out.println("Do you want to add a soda ?" + "\n" + "1.OK: Choose from the menue" + "\n"
							+ " (2) NO: Proceede with your order" + "\n");
					break;
				case "medium":
					MD_pizza = 1.99;
					totalAmount.add(MD_pizza);
					receipt.add("MD_pizza = 1.99");
					System.out.println("Medium pizza = 1.99");
					System.out.println("2.Please enter your choice of toppings");

					break;
				case "small":
					SM_pizza = 1.99;
					totalAmount.add(SM_pizza);
					receipt.add("SM_pizza = 1.99");
					System.out.println("Small pizza = 1.99");
					System.out.println("2.Please enter your choice of toppings");
					break;
				case "large":
					Dasani = 1.99;
					totalAmount.add(LG_pizza);
					receipt.add("LG_pizza = 1.99");
					System.out.println("LG_pizza = 1.99");
					System.out.println("2.Please enter your choice of toppings");
					break;
				case "no":
					System.out.println("Please proceed with your order");
					break;
				case "yes":
					System.out.println("1.Please Choose a size(Large, medium, and small )from the menu " + "\n");

					break;
				case "tea":
					PureLeafSweetTea = 1.99;
					totalAmount.add(PureLeafSweetTea);
					receipt.add("Pure Leaf Sweet Tea = 1.99");
					System.out.println("Pure Leaf Sweet Tea = 1.99");
					break;
				case "dasani":
					Dasani = 1.99;
					totalAmount.add(Dasani);
					receipt.add("Dasani = 1.99");
					System.out.println("Dasani = 1.99");
					break;
				case "ok":
					System.out.println("1.Please choose a soda from the menu. " + "\n"
							+ "Remember to enter \"F\" to finish your order");
					break;
				case "f":
					orderAmount();
					displayOrders();
					System.out
							.println("Do you want to make a second order?" + "\n " + "Two orders are allowed per session");
					System.out.println("\n " + "Do you want to order again? " + "\n" + "1.Enter \"1\" to satrt an order"
							+ "\n" + "2.Enter any Key to exit ");
					Scanner again = new Scanner(System.in);

					try {
						orderAgain = again.nextInt();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("Enjoy your meal");
					}

					// TODO Auto-generated catch block

					try {
						if (orderAgain == 1) {

							Orderpizza.createOrder();
							customerID2.add(customersName);
							menu2();
						} else {
							System.out.println("Thank you for your order. You are always welcome");
							System.exit(0);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("Wrong input. Please restart order ");
					}
				default:

					System.out.println("Item not found.Please enter correct item name");

					break;
				}
			} while (choice != "f");
		}

		private static void menu2() {
			// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			do {
				@SuppressWarnings("resource")
				Scanner item = new Scanner(System.in);
				choice = item.nextLine().toLowerCase().trim().toString();

				switch (choice) {// Selects items from menu
				case "coke":
					Coke = 1.99;
					System.out.println("Coke = 1.99");
					totalAmount2.add(Coke);
					receipt2.add("Coke = 1.99");
					break;
				case "mountaindew":
					Coke = 1.99;
					System.out.println("Mountain Dew = 1.99");
					totalAmount2.add(MountainDew);
					receipt2.add("Mountain Dew = 1.99");
					break;

				case "suasage":
					pepperoni = 1.99;
					System.out.println("Toppings:" + "\n" + "cheese = 1.99");
					System.out.println("suasage = 1.99");
					totalAmount2.add(pepperoni);
					receipt2.add("Suasage = 1.99");
					System.out.println("Do you want to add a soda ?" + "\n" + "1.OK: Choose from the menue"
							+ " (2) NO: Proceede with your order" + "\n");
					break;
				case "cheese":
					cheese = 1.99;
					System.out.println("Toppings:" + "\n" + "cheese = 1.99");
					totalAmount2.add(cheese);
					receipt2.add("Cheese = 1.99");
					System.out.println("Do you want to add a soda ?" + "\n" + "1.OK: Choose from the menue"
							+ " (2) NO: Proceede with your order" + "\n");
					break;
				case "pepperoni":
					suasage = 1.99;
					totalAmount2.add(pepperoni);
					receipt2.add("Toppings:" + "\n" + "pepperoni = 1.99");
					System.out.println("Do you want to add a soda ?" + "\n" + "1.OK: Choose from the menue"
							+ " (2) NO: Proceede with your order" + "\n");
					break;
				case "large":
					LG_pizza = 1.99;
					totalAmount2.add(LG_pizza);
					receipt2.add("Large Pizza = 1.99");
					System.out.println("Large Pizza = 1.99");
					System.out.println("2.Please enter your choice of toppings");
					break;
				case "small":
					SM_pizza = 1.99;
					totalAmount2.add(SM_pizza);
					receipt2.add("Small Pizza = 1.99");
					System.out.println("Small Pizza = 1.99");
					System.out.println("2.Please enter your choice of toppings");
					break;
				case "dasani":
					Dasani = 1.99;
					totalAmount2.add(Dasani);
					receipt2.add("Dasani = 1.99");
					System.out.println("Dasani = 1.99");
					break;
				case "tea":
					PureLeafSweetTea = 1.99;
					totalAmount2.add(PureLeafSweetTea);
					receipt2.add("Pure Leaf SweetTea = 1.99");
					System.out.println("Pure Leaf SweetTea = 1.99");
					break;
				case "medium":
					MD_pizza = 1.99;
					totalAmount.add(MD_pizza);
					totalAmount2.add(MD_pizza);
					receipt2.add("Medium Pizza = 1.99");
					System.out.println("Medium Pizza = 1.99");
					System.out.println("2.Please enter your choice of toppings");
					break;
				case "no":
					System.out.println("Please proceed with your order");
					break;
				case "yes":
					System.out.println("1.Please Choose a size(Large, medium, and small )from the menu " + "\n");
					break;
				case "ok":
					System.out.println("1.Please choose a soda from the menu. " + "\n"
							+ "Remember to enter \"F\" to finish your order");
					break;
				case "f":
					System.out.println("\n" + "****************************************" + "\n");
					displayOrders();
					System.out.println("__________________________________________________" + "\n");
					// System.out.println("********************************** :" + "\n");
					displayOrders2();
					System.out.println("Thank you for your order. You are always welcome");

					System.exit(0);
				default:

					System.out.println("Item not found.Please enter correct item name");

					break;
				}
			} while (choice != "f");
		}

		private static void orderAmount() {// adding orders
			// TODO Auto-generated method stub
			double itemSum = 0;
			for (double items : totalAmount) {//
				itemSum += items;
			}
			itemSum = (double) itemSum;
			System.out.println("_______________________________________________");
			System.out.println("Total order = $" + itemSum + "\n");
		}

		private static void orderAmount2() {// adding orders
			// TODO Auto-generated method stub
			double itemSum = 0;
			for (double items : totalAmount2) {//
				itemSum += items;
			}
			itemSum = (double) itemSum;
			System.out.println("_______________________________________________");
			System.out.println("Total order = $" + itemSum + "\n");
		}

		private static void displayOrders() {
			int countID = 0;
			for (String items : customerID) {// Printing customer ID from ArrayList
				if (countID == 0) {
					System.out.println("Order#:1 " + "\n" + "Customer :" + items + "\n");
					countID++;
				}
			}

			for (String items : receipt) { // Printing items on bill receipt and total cost
				System.out.println(items);
			}
			orderAmount();
			System.out.println("_______________________________________________");

		}

		private static void displayOrders2() {
			// TODO Auto-generated method stub
			int countID = 0;
			for (String items : customerID2) {
				if (countID == 0) {
					System.out.println("Order #2:" + "\n" + "Customer :" + items + "\n");
					countID++;
				}
			}

			System.out.println();

			for (String items : receipt2) {//
				System.out.println(items);
			}
			orderAmount2();
			System.out.println("_______________________________________________");

		}
	}


