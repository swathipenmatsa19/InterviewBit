/*


Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.

Return the count modulo 109 + 7.



Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the ( Total number of set bits in the binary representation of all the numbers from 1 to A )modulo 109 + 7.



Example Input
Input 1:

 A = 3
Input 2:

 A = 1


Example Output
Output 1:

 4
Output 2:

 1
 
 
 */
 
 
 public class Solution {
    public int solve(int A) {
        long c = 0, i = 2;
        A = A + 1;
        while(A / i > 0) {
            c += (A/i) * (i/2);
            c += (A%i > i/2)?(A%i)-i/2:0;
            i*=2;
        }
        c += (A%i>i/2) ? (A%i) -i/2:0;
        return c % 1000000007;
    }
}





