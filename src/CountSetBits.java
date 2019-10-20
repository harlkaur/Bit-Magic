
public class CountSetBits {

	public static void main(String[] args) {
		int n=42;
		System.out.println(count(n));
	}
	
	public static int count(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			count = count+countSetBits(i);
		}
		return count;
	}

	public static int countSetBits(int n){
		int res = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				res ++;
				//return res;
			}
		}
		return res;
    }
}
