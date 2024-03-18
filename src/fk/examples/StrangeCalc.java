package fk.examples;

import java.math.BigDecimal;

public class StrangeCalc {

	public static void main(String[] args) {

		float f1 = 1.03f;
		float f2 = .42f;
		float fres = (f1 - f2);

		System.out.println("floats: " + fres);

		int i1 = (int) f1;
		int i2 = (int) f2;
		int ires = (i1 - i2);

		System.out.println("casted ints: " + ires);

		double d1 = 1.03;
		double d2 = .42;
		double dres = (d1 - d2);

		System.out.println("doubles: " + dres);

		d1 = (float) d1;
		d2 = (float) d2;
		dres = (d1 - d2);

		System.out.println("doubles again: " + dres);

		BigDecimal b1 = new BigDecimal("1.03");
		BigDecimal b2 = new BigDecimal(".42");
		BigDecimal bres = b1.subtract(b2);

		System.out.println("BigDecimal: " + bres);
		
		short s1 = 32767;
		short s2 = (short) (s1 + 1);

		System.out.println("Next after " + s1 + " comes " + s2 + ".");

	}
}