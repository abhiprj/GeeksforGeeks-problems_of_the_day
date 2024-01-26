class Solution {
     public boolean check(int n, int c, int d) {
        while (n > 0) {
            int r = n % 10;
            if (r == c || r == d) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public long binpow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }

    public int bestNumbers(int N, int A, int B, int C, int D) {
        if (A == B) {
            return check(N * A, C, D) ? 1 : 0;
        }

        long mod = 1000000007;
        long ans = 0;
        List<Long> fac = new ArrayList<>();
        fac.add(1L);

        for (long i = 1; i <= N; i++) {
            fac.add((fac.get((int) (i - 1)) * i) % mod);
        }

        for (int i = 0; i <= N; i++) {
            int s = i * A + (N - i) * B;
            if (check(s, C, D)) {
                long part1 = (fac.get(N) * binpow(fac.get(i) * fac.get(N - i) % mod, mod - 2, mod)) % mod;
                ans = (ans + part1) % mod;
            }
        }

        return (int) ans;
    }
}
       