# coffee-shop
Coffee shop built in Java from JetBrains learning

# Running
This will allow user to interact with a coffee shop the way you would in real life.
* [Buy](https://github.com/abspen1/coffee-shop/tree/main#buy)
* [Fill](https://github.com/abspen1/coffee-shop/tree/main#fill)
* [Take](https://github.com/abspen1/coffee-shop/tree/main#take)
* [Remaining](https://github.com/abspen1/coffee-shop/tree/main#buy)

## JetBrains
This is a project from [here](https://hyperskill.org/projects/33?track=1). I chose to use Eclipse to build and run this project. Will work with whichever compiler of your choice. The main purpose of this project was to refresh my Java and OOP skills. I enjoyed creating this project for those reasons.

# Functions
List of each of the functions available to the user

## Buy
Allows user to buy either an espresso, latte, or a cappuccino. Each has their own specific needs as far as ingredients and price.
```bash
Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
Sorry, not enough water!
```

## Fill
Allows user to fill each ingredient with whatever amount they desire.
```bash
Write action (buy, fill, take, remaining, exit): 
> fill

Write how many ml of water do you want to add: 
> 1000
Write how many ml of milk do you want to add: 
> 0
Write how many grams of coffee beans do you want to add: 
> 0
Write how many disposable cups of coffee do you want to add: 
> 0
```

## Take
Allows user to take all of the money out of the register
```bash
Write action (buy, fill, take, remaining, exit): 
> take

I gave you $564
```

## Remaining
Displays what how much of each ingredient and the amount of money available.
```bash
Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
$550 of money
```
