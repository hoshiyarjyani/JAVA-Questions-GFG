// Palindromic Array
// SchoolAccuracy: 58.62%Submissions: 90K+Points: 0
// Lamp
// Stand out from the crowd. Prepare with Complete Interview Preparation  

// Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

// Example 1:

// Input:
// 5
// 111 222 333 444 555

// Output:
// 1

// Explanation:
// A[0] = 111 //which is a palindrome number.
// A[1] = 222 //which is a palindrome number.
// A[2] = 333 //which is a palindrome number.
// A[3] = 444 //which is a palindrome number.
// A[4] = 555 //which is a palindrome number.
// As all numbers are palindrome so This will return 1.
// Example 2:

// Input:
// 3
// 121 131 20

// Output:
// 0

// Explanation:
// 20 is not a palindrome hence the output is 0.

// Constraints:
// 1 <=T<= 50
// 1 <=n<= 20
// 1 <=A[]<= 10000

// View Bookmarked Problems 

class GfG {
    public static int palinArray(int[] a, int n) {
        // add code here.
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            String str = Integer.toString(a[i]);
            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return 1;
        } else {
            return 0;
        }
    }
}