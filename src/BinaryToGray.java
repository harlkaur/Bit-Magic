
public class BinaryToGray {

	public static void main(String[] args) {

		BinaryToGray ob = new BinaryToGray();
		String binary = "01001";
		System.out.println("Gray code of " + binary + " is " + ob.binarytoGray(binary));
	}

	String binarytoGray(String binary) {
		String gray = "";

		// MSB of gray code is same
		// as binary code
		gray += binary.charAt(0);

		// Compute remaining bits, next bit is
		// comuted by doing XOR of previous
		// and current in Binary
		for (int i = 1; i < binary.length(); i++) {
			// Concatenate XOR of previous bit
			// with current bit
			//gray += xor_c(binary.charAt(i - 1), binary.charAt(i));
			gray+=binary.charAt(i-1)^binary.charAt(i);
		}
		return gray;
	}
}
