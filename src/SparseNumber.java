
public class SparseNumber {

	public static void main(String[] args) {
		int n =3;
		System.out.println(sparseNumber(n));
	}

	private static boolean sparseNumber(int n) {
		if(countSetBits(n) == 0)
			return true;
		else
			return false;
	}
	
	public static int countSetBits(int n) {
		int res = 0;
		for (int i = 0; i < 31; i++) {
			if (((n & (1 << i)) != 0) && ((n & (1 << i+1)) != 0)) {
				res++;
			}
		}
		return res;
	}
}
