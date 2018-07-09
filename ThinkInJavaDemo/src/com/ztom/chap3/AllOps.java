package com.ztom.chap3;

public class AllOps {

	void f(boolean b) {}
	void boolTest(boolean x, boolean y) {
		//! x = x * y;
		//! x = x / y;
		//! x = x % y;
		//! x = x + y;
		//! x = x - y;
		//! x++;
		//! x--;
		//! x = +y;
		//! x = -y;
		//! f(x > y);
		//! f(x >= y);
		//! f(x < y);
		//! f(x <= y);
		f(x == y);
		f(x != y);
		f(!y);
		//! x = ~ y;
		x = x && y;
		x = x || y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		
		//! x += y;
		//! x -= y;
		//! x *= y;
		//! x /= y;
		//! x <<= y;
		//! x >>= y;
		//! x >>>= y;
		x &= y;
		x ^= y;
		x |= y;
		
		//! char c = (char)x;
		//! byte b = (byte)x;
		//! short s = (short)x;
		//! int i = (int)x;
		//! long l = (long)x;
		//! float f = (float)x;
		//! double d = (double)x;
	}
	
	void charTest(char x, char y) {
		x = (char)(x * y);
		x = (char)(x / y);
		x = (char)(x % y);
		x = (char)(x + y);
		x = (char)(x - y);
		x++;
		x--;
		x = (char)+y;
		x = (char)-y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		x = (char) ~y;
		x = (char) (x & y);
		x = (char) (x | y);
		x = (char) (x ^ y);
		x = (char) (x << 1);
		x = (char) (x >> 1);
		x = (char) (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		
		//! boolean bl = (boolean) x;
		byte b = (byte) x;
		 short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}
	
	void byteTest(byte x, byte y) {
		x = (byte)(x * y);
		x = (byte)(x / y);
		x = (byte)(x % y);
		x = (byte)(x + y);
		x = (byte)(x - y);
		x++;
		x--;
		x = (byte)+y;
		x = (byte)-y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		x = (byte) ~y;
		x = (byte) (x & y);
		x = (byte) (x | y);
		x = (byte) (x ^ y);
		x = (byte) (x << 1);
		x = (byte) (x >> 1);
		x = (byte) (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		//! boolean bl = (boolean) x;
		char c = (char) x;
		short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}
	
	void shortTest(short x, short y) {
		x = (short)(x * y);
		x = (short)(x / y);
		x = (short)(x % y);
		x = (short)(x + y);
		x = (short)(x - y);
		x++;
		x--;
		x = (short)+y;
		x = (short)-y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		x = (short) ~y;
		x = (short) (x & y);
		x = (short) (x | y);
		x = (short) (x ^ y);
		x = (short) (x << 1);
		x = (short) (x >> 1);
		x = (short) (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		//! boolean bl = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}
	void intTest(int x, int y) {
		x = (int)(x * y);
		x = (int)(x / y);
		x = (int)(x % y);
		x = (int)(x + y);
		x = (int)(x - y);
		x++;
		x--;
		x = (int)+y;
		x = (int)-y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		x = (int) ~y;
		x = (int) (x & y);
		x = (int) (x | y);
		x = (int) (x ^ y);
		x = (int) (x << 1);
		x = (int) (x >> 1);
		x = (int) (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		
		//! boolean bl = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}
	
	void longTest(long x, long y) {
		x = (long)(x * y);
		x = (long)(x / y);
		x = (long)(x % y);
		x = (long)(x + y);
		x = (long)(x - y);
		x++;
		x--;
		x = (long)+y;
		x = (long)-y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		x = (long) ~y;
		x = (long) (x & y);
		x = (long) (x | y);
		x = (long) (x ^ y);
		x = (long) (x << 1);
		x = (long) (x >> 1);
		x = (long) (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		
		//! boolean bl = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short)x;
		int i = (int)x;
		float f = (float)x;
		double d = (double)x;
	}
	
	void floatTest(float x, float y) {
		x = (float)(x * y);
		x = (float)(x / y);
		x = (float)(x % y);
		x = (float)(x + y);
		x = (float)(x - y);
		x++;
		x--;
		x = (float)+y;
		x = (float)-y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		//!  x = ~y;
		//!  x = x & y;
		//!  x = x | y;
		//!  x = (x ^ y);
		//!  x = (x << 1);
		//!  x = (x >> 1);
		//!  x = (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		//！ x <<= 1;
		//！ x >>= 1;
		//！ x >>>= 1;
		//！ x &= y;
		//！ x ^= y;
		//！ x |= y;
		
		//! boolean bl = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		double d = (double)x;
	}
	
	void doubleTest(double x, double y) {
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//！ f(!x);
		//!  f(x && y);
		//!  f(x || y);
		
		//!  x = ~y;
		//!  x = x & y;
		//!  x = x | y;
		//!  x = (x ^ y);
		//!  x = (x << 1);
		//!  x = (x >> 1);
		//!  x = (x >>> 1);
		
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		//！ x <<= 1;
		//！ x >>= 1;
		//！ x >>>= 1;
		//！ x &= y;
		//！ x ^= y;
		//！ x |= y;
		
		//! boolean bl = (boolean) x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
