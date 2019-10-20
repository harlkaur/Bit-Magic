
public class LongestConsecutiveOne {

	public static void main(String[] args) {
		int n  = 222; // 1101110111
		System.out.println(maxConsecutiveOnes(n));
	}

	
	public static int maxConsecutiveOnes(int n){
		int res = 0;
		int max  = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				res ++;
			}else if((n & (1 << i)) == 0){
				if(max < res) {
					max=res;
					//res=0;
				}
				res = 0;
			}
		}
		if(max < res) {
			max=res;
		}
		return max;
    }
}
