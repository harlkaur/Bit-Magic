
public class GrayToBinary {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(grayToBinary(n));
	}

	public static int grayToBinary(int n) {
		String gray = Integer.toBinaryString(n); // 100
		String binary = "";
		binary += gray.charAt(0);
		for (int i = 1; i < gray.length(); i++) {
			binary += binary.charAt(i - 1) ^ gray.charAt(i);
		}
		int result = Integer.parseInt(binary, 2);
		return result;
	}

}
