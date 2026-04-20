/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

11111
22222
33333
44444
55555

ASCII --> C CPP
A  -- 65
a  -- 97
0  -- 48
SPACE -- 32


Widening AND Narrowing  --> ASK MCQ Type Question

byte  1byte  8 bit 
short 2 byte 16 bit  -32768 32767
int   4 byte          2147483647   -21747483648

int num=1212121212;
long save=num;  // Widening
____________________________________
double val=9.8999;
float  x=val;  // ERROR   Strict Type Checking
float x=(float)val;

int num=64;
char letter=(char)(64+i);
*/
class Example8{
	public static void main(String[] args) {
			int n=5;

			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					System.out.print((char)(64+i));
					//System.out.print((char)(96+i));
				}
				System.out.println();
			}
	}
}