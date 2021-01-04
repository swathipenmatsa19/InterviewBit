/*

Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False

*/


public class Solution {
    public int isPalindrome(int A) {
        int sum = 0, n = A;
        
        while(A > 0) {
            int r = A % 10;
            sum = (sum * 10) + r;
            A = A / 10;
        }
        
        if(sum == n)
            return 1;
        else
            return 0;
    }
}




