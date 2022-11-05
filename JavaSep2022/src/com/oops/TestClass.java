package com.oops;

public class TestClass {
	
	public static void main(String[] args) {
			
		ABChild obj = new ABChild();
		
		obj.print();
		obj.add(10);
		
		IAB ab = (IAB) obj;		
		ab.printValue();
		
		IAC ac = (IAC) obj;		
		ac.printAC();
		
		String str = "A100";
		int a = Integer.parseInt(str);
		System.out.println(a);
	
		// Object
		
		/*
		Encap obj2 = new Encap();
		obj2.setName("raj");
		System.out.println(obj2.getName());
		
		Animal obj1 = new PolyExample2();
		obj1.run(); 
		
		PolyExample1 obj = new PolyExample1();
		obj.add();
		obj.add("Raj", "Kumar");
		obj.add(1, 20);*/
		
		/* Dog dog = new Dog();
		dog.bark();
		dog.eat();
		dog.run();
		
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
		cat.run(); */
	

	}

}
