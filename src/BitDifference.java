
public class BitDifference {

	public static void main(String[] args) {
		int a = 20;
		int b = 25;
		System.out.println(bitDiff(a, b));
	}

	private static int bitDiff(int a, int b) {
		int count = 0;
		count = countSetBits(a ^ b);
		return count;
	}

	public static int countSetBits(int n) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				res++;
			}
		}
		return res;
	}
}
