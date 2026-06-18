// MultiLevel inheritance
/*
class java.lang.Object{

	Object(){ }
	protected Object	clone()	
Creates and returns a copy of this object.
boolean	equals(Object obj)	
Indicates whether some other object is "equal to" this one.
protected void	finalize()	
Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
Class<?>	getClass()	
Returns the runtime class of this Object.
int	hashCode()	
Returns a hash code value for the object.
void	notify()	
Wakes up a single thread that is waiting on this object's monitor.
void	notifyAll()	
Wakes up all threads that are waiting on this object's monitor.
String	toString()	
Returns a string representation of the object.
void	wait()	
Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.
void	wait(long timeout)	
Causes the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
void	wait(long timeout, int nanos)	
Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.

}

*/
// class Art extends Object
class Art{
	int x;

	Art(){
		super();
		System.out.println("Art Construcor");
	}

}

class Drawing extends Art{
	double y;
	Drawing(){
		super();
		System.out.println("Drawing Construcor");
	}

}

class Cartoon extends Drawing{
	char z;
	
	Cartoon(){
		super();
		System.out.println("Cartoon Construcor");
	}

}


public class App{
	public static void main(String[] args) {

		Art art=new Art();
		System.out.println("-------------");
		Drawing draw=new Drawing();
		System.out.println("-------------");
		Cartoon tomAndJerry=new Cartoon();


		
	}
}