
import java.util.*;

class Complex {
	private double real, img;

	public Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public Complex() {
		this(0, 0);
	}

	public void setReal(double real) {
		this.real = real;
	}

	public void setImg(double img) {
		this.img = img;
	}

	public double getReal() {
		return real;
	}

	public double getImg() {
		return img;
	}

	public void reset(double real, double img) {
		this.real = real;
		this.img = img;
	}

	@Override
	public String toString() {
		if (img > 0.0) {
			if (real == 0.0)
				return "(" + img + "i" + ")";
			else
				return "(" + real + "+" + img + "i" + ")";
		} else if (img < 0.0) {
			if (real == 0.0)
				return "(" + img + "i" + ")";
			else
				return "(" + real + img + "i" + ")";// Notice!
		} else
			return "(" + real + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj != null && obj.getClass() == Complex.class) {
			Complex cop = (Complex) obj;
			if (this.getImg() == cop.getImg()
					&& this.getReal() == cop.getReal()) {
				return true;
			}
		}

		return false;
	}

	// (a+bi)+(c+di)=(a+c)+(b+d)i
	public Complex add(Complex c) {
		double real = this.real + c.real;
		double img = this.img + c.img;
		return new Complex(real, img);
	}

	// (a+bi)-(c+di)=(a-c)+(b-d)i
	public Complex sub(Complex c) {
		double real = this.real - c.real;
		double img = this.img - c.img;
		return new Complex(real, img);
	}

	// (a+bi)*(c+di)=(a*c-b*d)+(b*c+a*d)i
	public Complex mul(Complex c) {
		double real = this.real * c.real - this.img * c.img;
		double img = this.img * c.real + this.real * c.img;
		return new Complex(real, img);
	}

	// (a+bi)/(c+di)=(a*c+b*d)/(c*c+d*d) +((b*c-a*d)/(c*c+d*d))i
	public Complex div(Complex c) {
		Complex ret = new Complex();
		ret.real = this.real * c.real + this.img * c.img;
		ret.img = this.img * c.real - this.real * c.img;
		ret.real /= c.getModulus();
		ret.img /= c.getModulus();
		return ret;
	}

	// get |a+bi|
	public double getModulus() {
		return Math.sqrt(real * real + img * img);
	}
}

public class ComplexDemo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Complex c1, c2, c3, ret;
		c1 = new Complex(0, 0);
		c2 = new Complex(0, 0);

		double r1, i1, r2, i2, r3, i3;
		System.out.println("Enter complex c1:");
		r1 = sc.nextDouble();
		i1 = sc.nextDouble();
		c1.reset(r1, i1);

		System.out.println("Enter complex c2:");
		r2 = sc.nextDouble();
		i2 = sc.nextDouble();
		c2.reset(r2, i2);

		System.out.println("Enter complex c3:");
		r3 = sc.nextDouble();
		i3 = sc.nextDouble();
		c3 = new Complex(r3, i3);

		ret = c1.add(c2);
		
		
		
		System.out.println(c1 + " + " + c2 + " = " + ret);

		ret = c1.sub(c2);
		System.out.println(c1 + " - " + c2 + " = " + ret);

		ret = c1.mul(c2);
		System.out.println(c1 + " * " + c2 + " = " + ret);

		ret = c1.div(c2);
		System.out.println(c1 + " / " + c2 + " = " + ret);

		System.out.println(c1 + " == " + c2 + " ? " + c1.equals(c2));
		System.out.println(c1 + " == " + c3 + " ? " + c1.equals(c3));
		System.out.println(c2 + " == " + c3 + " ? " + c2.equals(c3));

	
		sc.close();
	}
}