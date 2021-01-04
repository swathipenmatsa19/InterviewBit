/*

  Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Input Format:

    First and only argument of input contains an integer array A
Output Format:

    return a single integer denoting single element
Constraints:

2 <= N <= 2 000 000  
0 <= A[i] <= INT_MAX
For Examples :

Example Input 1:
    A = [1, 2, 2, 3, 1]
Example Output 1:
    3
Explanation:
    3 occurs only once
Example Input 2:
    A = [1, 2, 2]
Example Output 2:
    1

*/


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int c = A[0];
        for(int i = 1; i < A.length; i++)
            c = c ^ A[i];
        return c;
    }
}

