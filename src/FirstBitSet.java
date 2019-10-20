
public class FirstBitSet {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(getFirstSetBitPos(n));
	}

	public static int getFirstSetBitPos(int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			if ((n & (1 << i)) != 0) {
				res = i+1;
				return res;
			}
		}
		return res;
	}
}
