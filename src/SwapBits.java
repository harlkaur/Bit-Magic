
public class SwapBits {

	public static void main(String[] args) {
		int n = 23;
		System.out.println(swapBits(n));
	}

	public static int swapBits(int n) {
		int even = n & 0xAAAAAAAA;
		int odd = n & 0x55555555;
		even >>= 1;
		odd <<= 1;
		int result = even | odd;
		return result;
	}

}
