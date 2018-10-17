package com.ztom.chap5;
//Show default initial values

class Measurement {
//	boolean t;
//	char c;
//	byte b;
//	short s;
//	int i;
//	long l;
//	float f;
//	double d;

	boolean t = true;
	char c = 'x';
	byte b = 47;
	short s = 0xff;
	int i = 999;
	long l = 1;
	float f = 3.14f;
	double d = 3.14159;

//	Depth o = new Depth();
//	boolean b = true;

	void print() {
		System.out.println("Data type	Inital value\n" + "boolean	" + t + "\n" + "char	" + c + "\n" + "byte	"
				+ b + "\n" + "short	" + s + "\n" + "int	" + i + "\n" + "long	" + l + "\n" + "float	" + f + "\n"
				+ "double	" + d + "\n");
	}
}

//class CInit{
//	int i = f();
//}

//class CInit{
//	int i = f();
//	int j = g(i);
//}

//class CInit {
//	int j = g(i);
//	int i = f();
//}

public class InitialValues {

	public static void main(String[] args) {
		Measurement d = new Measurement();
		d.print();
		/*
		 * In this case you could also say: new Measurement().print();
		 */
	}

}
