
class Solution{
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	static List<Integer> primeDivision(int N) {
		List<Integer> list = new ArrayList<>();
		
		for (int i =2; i <N; i++) {
			if(isPrime(i)&& isPrime(N-i))
			{
				list.add(i);
				list.add(N-i);
				return list;

			}
		}
		return list;
	}
}