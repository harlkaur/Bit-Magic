import java.math.BigInteger;

public class Powerof2 {

	public static void main(String[] args) {

		BigInteger n = new BigInteger("0");
		if (isPowerofTwo(n)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static boolean isPowerofTwo(BigInteger n) {

		BigInteger one = new BigInteger("1");
		BigInteger value = n.and(n.subtract(one));
		System.out.println(value);
		if ((n.compareTo(BigInteger.ZERO))!=0  && (value.compareTo(BigInteger.ZERO))==0) {
			return true;
		} else
			return false;
	}
}
