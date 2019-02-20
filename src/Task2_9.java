
public class Task2_9 {

	
		    public static void main(String[] args) {
		        int[] B = {-1, 2, 6, 3, 9, 2, -3, -2, 11, 5, 7};
		        System.out.println("min = " + maxArrayIndex(B, 0, B.length - 1));
		    }

		    static int maxArrayIndex(int[] X, int p, int r) {
		        int q = 0;
		        if (p < r) {
		            q = (p + r) / 2;
		            int maxLeft = maxArrayIndex(X, p, q);
		            int maxRight = maxArrayIndex(X, q + 1, r);
		            int maxFinal = max(X, maxLeft, maxRight);
		            return maxFinal;
		        }
		       
		        return r;
		    }

		    static int max(int[] X, int p, int r) {
		        int maxIndex = 0;

		        if (X[p] > X[r]) {
		            maxIndex = p;
		        } else {
		            maxIndex = r;
		        }
		        return maxIndex;
		    }
		}


