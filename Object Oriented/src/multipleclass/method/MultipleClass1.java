package multipleclass.method;

import multipleclass.method.nal;

public class MultipleClass1{
	
	public static void main(String[] args) {
		nal sum;
		sum = new nal();
		sum.seta(12);
		System.out.println(sum.geta());
	}
}

class nal {		//	Single Java Source File Can Not Have More Than One public class
	private int a;

	public int geta() {
		return a;
	}
	public void seta(int a) {
		this.a = a;
	}
}
