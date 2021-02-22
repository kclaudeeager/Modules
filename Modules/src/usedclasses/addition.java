package usedclasses;

public class addition {
	

	private int n1,n2;
public addition()
{
	System.out.println("This is Addition class");
}
	
public addition(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int summation()
	{
		return n1+n2;
	}
	@Override
	public String toString() {
		return "addition [n1=" + n1 + ", n2=" + n2 + ", getN1()=" + getN1() + ", getN2()=" + getN2() + ", summation()="
				+ summation() + "]";
	}
	

}
