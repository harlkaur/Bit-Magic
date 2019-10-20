
public class BtoGrayGeeks {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(greyConverter(n));
	}

	public static int greyConverter(int n) {
		String binary = Integer.toBinaryString(n);
		String gray = "";
		gray += binary.charAt(0);
		for (int i = 1; i < binary.length(); i++) {
			gray+=binary.charAt(i-1)^binary.charAt(i);
		}
		
		int res = Integer.parseInt(gray, 2);
		return res;
	}
}
