
public class CheckwhetherKbitissetornot {

	public static void main(String[] args) {
		int n = 500;
		int k = 3;
		System.out.println(checkKthBit(n, k));
	}

	static boolean checkKthBit(int n, int k) {
		/*
		 * if ((n & (1 << k)) == 0) return false; else return true;
		 */
		
		return ((n & (1 << k)) == 0)  ? false:true;
	}
}
