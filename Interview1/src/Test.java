
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		boolean b = t.callResult(81);
		System.out.println(b);

	}
	public boolean callResult(int n) {
		if(n <= 0) {
			return false;
		}
		while(n%3==0) {
			n/=3;
			System.out.println(n/=3);
		}
		return n ==1;
	}

}
