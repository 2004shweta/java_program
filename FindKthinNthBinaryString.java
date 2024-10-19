class Solution {
    public char findKthBit(int n, int k) {
        return findKthBitHelper(n, k);
    }

    private char findKthBitHelper(int n, int k) {
       
        if (n == 1) {
            return '0';
        }
        

        int length = (1 << n) - 1;  
        int mid = length / 2 + 1;   
        
        
        if (k == mid) {
            return '1';
        }
        
        
        if (k < mid) {
            return findKthBitHelper(n - 1, k);
        } else {
           
            int mirrorIndex = length - k + 1;
            char bit = findKthBitHelper(n - 1, mirrorIndex);
            return bit == '0' ? '1' : '0'; 
        }
    }
    }
