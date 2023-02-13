package simran_practice;



import java.util.Scanner;

/*

1. A company pays its employees on a weekly basis. The employees are of four types: 
a. Salaried employees are paid a fixed weekly salary regardless of the number of hours worked, 
b. hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary rate) 
for all hours worked in excess of 40 hours, 
c. commission employees are paid 15 percent of their sales and 
d. base-salaried commission employees receive a base salary plus 12 percent of their sales.
For the current pay period, the company has decided to reward bonus to base-salaried-commission employees
 by adding 10% to their base salaries. Write an java program that performs its payroll calculations.


Please enhance Payroll application to:Take personal data as input such as email, phone etcIn the end prompt 
user for emplyee name and prints its payroll and details

DEFINTION:-
Factory design design defines an interface/ abstract class for creating an object
but let subclass define which class to instantiate

*/

abstract class Employee{
	
	String fname;
	String lname;
	String email;
	String type;
	Scanner sc = new Scanner(System.in);
	
	
	Employee(String fname,String lname,String email,String type){
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.type=type;
	}
	
	abstract double cal();
	abstract void details();
	
	
	
}

class FixedSalary extends Employee{
	
	final int salary=5000;
	Scanner sc;
	FixedSalary(String fname, String lname, String email, String type, Scanner sc) {
		super(fname, lname, email, type);
		this.sc=sc;
	}
	
	@Override
	double cal() {
		System.out.println("Enter number of weeks");
		int week=sc.nextInt();
		return week*salary;
	}
	
	@Override
	public void details() {
		System.out.println("First Name: " + super.fname + "\n" + "Last Name: " + super.lname+ "\n" + "Email: "+ super.email + "\n"+"Type: "+ super.type + " \n" +  "Payment till date: " + cal() );
		System.out.println();
	}

	
}

class Hourly extends Employee{
	int hourlyAmount=7000;
	
	Hourly(String fname, String lname, String email, String type, Scanner sc) {
		super(fname, lname, email, type);
		this.sc=sc;

	}
	
	double cal() {
		System.out.println("no. of hours: ");
		int hours=sc.nextInt();
		if(hours>=40) {
			int hoursLeft=hours-40;
			return  (hourlyAmount*hours+hoursLeft*1.5*hourlyAmount);
		}
		return hourlyAmount*hours;
	}


	@Override
	void details() {
		System.out.println("First Name: " + super.fname + "\n" + "Last Name: " + super.lname+ "\n" + "Email: "+ super.email+"\n"  +"Type: "+ super.type + "\n" + "Payment till date: " + cal() );
		System.out.println();
	}
	
}

class Commission extends Employee{

	Commission(String fname, String lname, String email, String type, Scanner sc) {
		super(fname, lname, email, type);
		this.sc=sc;
	}
	
	@Override
	double cal() {
		System.out.println("Enter the amount of sales: ");
		int sales=sc.nextInt();
		return 15*sales/100;
	}

	@Override
	void details() {
		System.out.println("First Name: " + super.fname + "\n" + "Last Name: " + super.lname+ "\n" + "Email: "+ super.email + "\n" +"Type: "+ super.type + " \n"  + "Payment till date: " + cal() );
		System.out.println();	
	}

	
}

class BaseCommission extends Employee{
	
	final int salary=5000;

	BaseCommission(String fname, String lname, String email, String type, Scanner sc) {
		super(fname, lname, email, type);
		this.sc=sc;
		
	}
	
	@Override
	double cal() {
		System.out.println("no. of weeks: ");
		int weeks=sc.nextInt();
		System.out.println("sales: ");
		int sales=sc.nextInt();
		int commission=sales*12/100;
		return commission+weeks*salary;
	}
	
	@Override
	public void details() {
		System.out.println("First Name: " + super.fname + "\n" + "Last Name: " + super.lname+ "\n" + "Email: "+ super.email +"\n"+"Type: "+ super.type + "\n" + "Payment till date: " + cal() );
		System.out.println();
	}
}

//class Factory
class FactoryEmployee{
	static Employee objectMaker(String fname, String lname, String email, String type, Scanner sc ) {
		
		if("A".equalsIgnoreCase(type)) {
			return new FixedSalary(fname, lname, email, type,sc);
		}
		else if("B".equalsIgnoreCase(type)) {
			return new Hourly(fname, lname, email, type, sc);
		}
		else if("C".equalsIgnoreCase(type)) {
			return new Commission(fname, lname, email, type,sc);
		}
		else if("D".equalsIgnoreCase(type)) {
			return new BaseCommission(fname, lname, email, type,sc);
		}
		throw new IllegalArgumentException("Unknown Argument");
	}
}


public class FactoryDesign {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("A for fixed employee \nB for Hourly employee \nC for Commission Employees \nD for Base and Commission Employee");
		System.out.println();
		
		
		while(true){
			System.out.println("Enter first name: ");
			String fname=sc.next();
			System.out.println("Enter last name: ");
			String lname=sc.next();
			System.out.println("Enter email: ");
			String email=sc.next();
			System.out.println("Enter Type: ");
			String type=sc.next();
			System.out.println();
			Employee o = FactoryEmployee.objectMaker(fname,lname,email,type,sc);
			o.details();
			System.out.println("Enter Employee details:- type Y for yes and N for no \n");
			String x=sc.next();
			if(x.equalsIgnoreCase("n")) {
				break;
			}
			
		}
		
		
	}

}
