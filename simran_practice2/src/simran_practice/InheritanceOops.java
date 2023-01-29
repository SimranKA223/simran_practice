package simran_practice;

//inheritance is a process of acquiring the properties(data members) and functionalities(methods)
//of another class 

//Aim:- reusability of code.

//Single level inheritance
class A{
	void method() {
		System.out.println("A");
	}
}

class B extends A{
	void method() {
		System.out.println("B");
	}
}

//multilevel
class X{
	void show() {
		System.out.println("X");
	}
}

class Y extends X{
	void show() {
		System.out.println("Y");
	}
}

class Z extends Y{
	
	
	
	void show() {
		super.show();
		System.out.println("Z");
	}
}

//hierarchical 
class Animal{
	void eats() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Cat Meows");
	}
}

//multiple inheritance
interface AnimalEat{
	void eat();
}

interface AnimalTravel{
	void travel();
}

class Animals implements AnimalEat, AnimalTravel{
	public void eat() {
		System.out.println("eat");
	}
	public void travel() {
		System.out.println("travel");
	}
}

public class InheritanceOops {

	public static void main(String[] args) {
		//single level
		B obj =new B();
		//obj.method();
		//multilevel
		Z obj1=new Z();
		obj1.show();
		//hierarchical
		Cat obj3=new Cat();
		obj3.eats();
		obj3.meow();
		//multiple inheritance
		Animals a = new Animals();
		a.eat();
		a.travel();
	}

}
