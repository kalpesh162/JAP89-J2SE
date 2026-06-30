class Meal {
 int x;
 Meal() { System.out.println("Meal()"); }
}

class Bread {
int y;
 Bread() { System.out.println("Bread()"); }
}

class Cheese {
int z;
 Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
int a;
 Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
int b;
 Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
int c;
 PortableLunch() { System.out.println("PortableLunch()");}
}


public class Sandwich extends PortableLunch {
 private Cheese c = new Cheese();
 private Lettuce l = new Lettuce();
 
 int m;
 public Sandwich() { 
 	System.out.println("Sandwich()"); 
 }

 public static void main(String[] args) {
 	new Sandwich();
 }

 private Bread b = new Bread();
 

}


/*

Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method. 

	add a wheels( ) method in Cycle, which
	returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
	polymorphism works. 

	*/