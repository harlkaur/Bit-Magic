
public class Rightmostdifferentbit {

	public static void main(String[] args) {
		int m = 11;
		int n = 9;
		System.out.println(posOfRightMostDiffBit(m, n));
	}

	public static int posOfRightMostDiffBit(int m, int n) {
		int res = -1;
		res = m ^ n;
		int result = getFirstSetBitPos(res);
		return result;
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
