import java.util.Scanner;

/**
 * @author Austin Spencer
 * @version 1.0
 * 
 * This program is 100% my own code
 * Using the idea from https://hyperskill.org/curriculum (JetBrains)
 * 
 * Using this as a refresher to Java and OOP
 */
public class CoffeeMachine {

	private int purchase;
	private int water;
	private int milk;
	private int coffee;
	private int cups;
	private int money;
	
	/**
	 * General constructor with amounts initialized how JetBrains said to
	 */
	public CoffeeMachine() {
		this.water = 400;
		this.milk = 540;
		this.coffee = 120;
		this.cups = 9;
		this.money = 550;
	}
	
	/**
	 * Constructor with parameters for specific starting point
	 * 
	 * @param water amount of water (int)
	 * @param milk amount of milk (int)
	 * @param coffee amount of coffee beans (int)
	 * @param cups amount of coffee cups (cups)
	 * @param money amount of money (int)
	 */
	public CoffeeMachine(int water, int milk, int coffee, int cups, int money) {
		this.water = water;
		this.milk = milk;
		this.coffee = coffee;
		this.cups = cups;
		this.money = money;
	}

	/**
	 * Main function
	 * 
	 * If I cared enough I would create a driver class and move this main function into there
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CoffeeMachine transaction = new CoffeeMachine();
		
		String action;
		
		do {
			System.out.println("\nWrite action(buy, fill, take, remaining, exit):");
			action = scanner.next();
			
			if (action.equals("buy")) {
	        	System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
	        	try {
	        		transaction.purchase = Integer.parseInt(scanner.next());
	        	}
	        	catch (NumberFormatException e) {
	                // This allows someone to type 'back' or anything other than 1, 2, or 3 and not produce an error
	            }
	        	
	        	if (transaction.purchase == 1) {
	        		if (transaction.water < 250) {
	        			System.out.println("Sorry, not enough water!");
	        		}
	        		else if(transaction.cups < 1) {
	        			System.out.println("Sorry, not enough cups!");
	        		}
	        		else if(transaction.coffee < 16) {
	        			System.out.println("Sorry, not enough coffee beans!");
	        		}
	        		else {
	        			System.out.println("I have enough resources, making you a coffee!");
	        			transaction.cups -= 1;
		        		transaction.water -= 250;
		        		transaction.coffee -= 16;
		        		transaction.money += 4;
	        		}
	        	}
	        	else if (transaction.purchase == 2) {
	        		if (transaction.water < 350) {
	        			System.out.println("Sorry, not enough water!");
	        		}
	        		else if(transaction.cups < 1) {
	        			System.out.println("Sorry, not enough cups!");
	        		}
	        		else if(transaction.coffee < 20) {
	        			System.out.println("Sorry, not enough coffee beans!");
	        		}
	        		else if (transaction.milk < 75) {
	        			System.out.println("Sorry, not enough milk!");
	        		}
	        		else {
	        			System.out.println("I have enough resources, making you a coffee!");
		        		transaction.cups -= 1;
		        		transaction.water -= 350;
		        		transaction.milk -= 75;
		        		transaction.coffee -= 20;
		        		transaction.money += 7;
	        		}
	        	}
	        	else if (transaction.purchase == 3) {
	        		if (transaction.water < 200) {
	        			System.out.println("Sorry, not enough water!");
	        		}
	        		else if(transaction.cups < 1) {
	        			System.out.println("Sorry, not enough cups!");
	        		}
	        		else if(transaction.coffee < 12) {
	        			System.out.println("Sorry, not enough coffee beans!");
	        		}
	        		else if (transaction.milk < 100) {
	        			System.out.println("Sorry, not enough milk!");
	        		}
	        		else {
	        			System.out.println("I have enough resources, making you a coffee!");
		        		transaction.cups -= 1;
		        		transaction.water -= 200;
		        		transaction.milk -= 100;
		        		transaction.coffee -= 12;
		        		transaction.money += 6;
	        		}
	        	}
	        }
	        else if (action.equals("fill")) {
	        	System.out.println("Write how many ml of water do you want to add:");
	        	transaction.water += Integer.parseInt(scanner.next());
	        	System.out.println("Write how many ml of milk do you want to add:");
	        	transaction.milk += Integer.parseInt(scanner.next());
	        	System.out.println("Write how many grams of coffee beans do you want to add:");
	        	transaction.coffee += Integer.parseInt(scanner.next());
	        	System.out.println("Write how many disposable cups of coffee do you want to add:");
	        	transaction.cups += Integer.parseInt(scanner.next());
	        }
	        
	        else if (action.equals("take")) {
	        	String out = "\nI gave you $" + transaction.getMoney();
	        	System.out.println(out);
	        	transaction.money = 0;
	        }
	        else if (action.equals("remaining")) {
	        	transaction.remaining(transaction);
	        }
		} while(!action.equals("exit"));
		
        scanner.close();
    }
	
	/**
	 *
	 * @param water water to set (in mL)
	 */
	public void setWater(int water) {
		this.water = water;
	}
	
	/**
	 * 
	 * @return current amount of water (in mL)
	 */
	public int getWater() {
		return this.water;
	}
	
	/**
	 * 
	 * @param milk milk to set (in mL)
	 */
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	/**
	 * 
	 * @return current amount of milk (in mL)
	 */
	public int getMilk() {
		return this.milk;
	}
	
	/**
	 * 
	 * @param coffee coffee beans to set (in g) 
	 */
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	/**
	 * 
	 * @return current amount of coffee beans (in g)
	 */
	public int getCoffee() {
		return this.coffee;
	}
	
	/**
	 * 
	 * @param cups cups to set
	 */
	public void setCups(int cups) {
		this.cups = cups;
	}
	
	/**
	 * 
	 * @return current amount of cups
	 */
	public int getCups() {
		return this.cups;
	}
	
	/**
	 * 
	 * @param money money to set (in $)
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 
	 * @return current amount of money (in $)
	 */
	public int getMoney() {
		return this.money;
	}
	
	/**
	 * Prints what is remaining in the coffee shop
	 * 
	 * @param transaction current object of CoffeeMachine
	 */
	public void remaining(CoffeeMachine transaction) {
		System.out.println("\nThe coffee machine has: ");
        String out = transaction.getWater() + " of water";
        System.out.println(out);
        out = transaction.getMilk() + " of milk";
        System.out.println(out);
        out = transaction.getCoffee() + " of coffee beans";
        System.out.println(out);
        out = transaction.getCups() + " of cups";
        System.out.println(out);
        out = "$" + transaction.getMoney() + " of money";
        System.out.println(out);
	}

}
