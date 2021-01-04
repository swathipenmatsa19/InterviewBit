/*

Please Note:

There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
This is one of those problems.
Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105

 Food for thought :
Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow. 
For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them. 
Another approach is to only multiple numbers from k + 1 ... n to calculate the result. 
Obviously approach 1 is more susceptible to overflows.
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B

*/



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int xor = A[0];
        int n = A.length;
        for(int i = 1; i < n; i++) 
            xor = xor ^ A[i];
        for(int i = 1; i <=n; i++)
            xor = xor ^ i;
        
        int first = 0, second = 0;
        int set_bit = xor & ~(xor - 1);
        for(int i = 0; i < n; i++) {
            if((A[i] & set_bit) != 0)
                first = first ^ A[i];
            else
                second = second ^ A[i];
        }
        
        for(int i = 1; i <= n; i++) {
            if((i & set_bit) != 0)
                first = first ^ i;
            else
                second = second ^ i;
        }
        
        int a[] = new int[2];
        for(int i = 0; i < n; i++) {
            if(A[i] == first) {
                a[0] = first;
                a[1] = second;
                break;
            } else {
                a[1] = first;
                a[0] = second;
            }
        }
        return a;
            
    }
}
