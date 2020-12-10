import java.util.Scanner;

/**
 * 
 */

/**
 * @author Austin Spencer
 *
 */
public class CoffeeMachine {

	private int purchase;
	private int water;
	private int milk;
	private int coffee;
	private int cups;
	private int money;
	/**
	 * 
	 */
	public CoffeeMachine() {
		this.water = 400;
		this.milk = 540;
		this.coffee = 120;
		this.cups = 9;
		this.money = 550;
	}

	/**
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
	                // It's OK to ignore "e" here because returning a default value is the documented behaviour on invalid input.
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
	
	public void setWater(int water) {
		this.water = water;
	}
	
	public int getWater() {
		return this.water;
	}
	
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public int getMilk() {
		return this.milk;
	}
	
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	public int getCoffee() {
		return this.coffee;
	}
	
	public void setCups(int cups) {
		this.cups = cups;
	}
	
	public int getCups() {
		return this.cups;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
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
