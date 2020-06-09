//413. Arithmetic Slices
.//Time:O(n)
//Space:O(1)
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int sum = 0;
        int right = 0;
        for(int i = A.length - 3; i >= 0; --i){
            
            if(A[i] - A[i + 1] == A[i+1]-A[i+2]){
                right = right + 1;
                sum+= right;
            }
            else 
                right = 0;
        }
        return sum;
    }
}
