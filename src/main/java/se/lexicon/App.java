package se.lexicon;
import java.util.*;

public class App 
{

    public static void main( String[] args ) {
        int iceCoffee, iceTea, cola = 15;
        int sneakers, bounty, Galaxy = 20;
        int pizzaSlice, cheezyBread, nuts = 25;
        int choice = 0;

        System.out.println("if you want iceCoffee press 1 price 15kr/n if you want iceTea press 2 price 15kr /n if you want cola press 3 price 15kr");
        System.out.println("if you want sneakers press 4 price 20kr/n if you want bounty press 5 price 20kr /n if you want Galaxy press 6 price 20kr");
        System.out.println("if you want pizzaSlice press 7 price 25kr/n if you want cheezyBread press 8 price 25kr /n if you want nuts press 9 price 25kr");

        System.out.println("Please enter your selection.");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();


    }