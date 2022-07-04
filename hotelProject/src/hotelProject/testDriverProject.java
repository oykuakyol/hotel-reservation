package hotelProject;
import java.util.*;
public class testDriverProject {
public static void main(String [] args) {
	System.out.println("Welcome to Java Hotel!");
System.out.println("Please enter your name to create a new reservation.");
Scanner scan=new Scanner(System.in);
String name=scan.nextLine();
System.out.println("Please enter how many days would you like to make a reservation");
int day=scan.nextInt();
System.out.println("enter year");
int year=scan.nextInt();

System.out.println("enter month:");
int month=scan.nextInt();
System.out.println("enter poeple count");
int cust=scan.nextInt();

System.out.println("enter ages:");
int age=scan.nextInt();

System.out.println("enter date");
int date=scan.nextInt();

System.out.println("enter room type");
int decider=scan.nextInt();

System.out.println("enter act");
int act=scan.nextInt();

hotelProject inp3=new hotelProject( year, month, cust, age, date, decider, act);

System.out.println("Your reservation is done.Thank you to choosing us.");
}
}