package lanqiao.有理数类;

public class Solution {
    class Rational {
        private long ra;
        private long rb;

        private long gcd(long a,long b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public Rational(long a,long b) {
            ra = a;
            rb = b;
            long k = gcd(ra, rb);
            if (k > 1) {
                ra /= k;
                rb /= k;
            }
        }

        public Rational add(Rational x) {
            return null;
        }

        public Rational mul(Rational x) {
            return new Rational(ra * x.ra, rb * x.rb);
        }

        @Override
        public String toString() {
            if (rb == 1) {
                return "" + ra;
            }
            return "Rational{" +
                    "ra=" + ra +
                    ", rb=" + rb +
                    '}';
        }
    }

}
