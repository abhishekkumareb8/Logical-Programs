package Logical;

public class Singleton {
	
	

	public static void main(String[] args) {
		Sample s1=Sample.getInstance();
		Sample s2=Sample.getInstance();
		Sample s3=Sample.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
class Sample{
	static Sample s;
	static int count=0;
	private Sample() {
		count++;
	}
	
	public static Sample getInstance() {
		if(count<1) {
			s=new Sample();
		}
		return s;
	}
}