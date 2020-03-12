

public class Fraction {
	private int nume; // 分子
	private int deno; // 分母

	Fraction() {
		nume = 0;
		deno = 1;
	}

	Fraction(int n, int d) {
		nume = n;
		deno = d;
	}

	// 约分-辗转相除法
	void reduce() {
		int m, n;

		m = nume;
		n = deno;

		if (m < n) {
			int t = m;
			m = n;
			n = t;
		}

		int r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}

		nume /= n;
		deno /= n;
	}

	// 编写代码，完成两个分数相加
	Fraction add(Fraction f) {
		
	}

	// 编写代码，完成两个分数相减
	Fraction sub(Fraction f) {
		
	}

	// 编写代码，完成两个分数相乘
	Fraction mul(Fraction f) {
		
	}

	// 编写代码，完成两个分数相除
	Fraction dvi(Fraction f) {
		Fraction ret = new Fraction();
		ret.nume = this.nume * f.deno;
		ret.deno = this.deno * f.nume;
		ret.reduce();
		return ret;
	}

	// 重写 、覆盖
	@Override
	public String toString() {
		return nume + "/" + deno;
	}

	@Override
	public boolean equals(Object obj) { // 父类引用，可以指向子类对象
	// super.equals(obj);
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj.getClass() == Fraction.class) { // this.getClass()也可
			Fraction of = (Fraction) obj;
			if (of.nume == this.nume && of.deno == this.deno)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
}
