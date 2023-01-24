// Longest Common Prefix in an Array
// EasyAccuracy: 29.52%Submissions: 156K+Points: 2
// Lamp
// Stand out from the crowd. Prepare with Complete Interview Preparation  

// Given a array of N strings, find the longest common prefix among all strings present in the array.

// Example 1:

// Input:
// N = 4
// arr[] = {geeksforgeeks, geeks, geek,
//          geezer}
// Output: gee
// Explanation: "gee" is the longest common
// prefix in all the given strings.
// Example 2:

// Input: 
// N = 2
// arr[] = {hello, world}
// Output: -1
// Explanation: There's no common prefix
// in the given strings.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function longestCommonPrefix() which takes the string array arr[] and its size N as inputs and returns the longest common prefix common in all the strings in the array. If there's no prefix common in all the strings, return "-1".

// Expected Time Complexity: O(N*max(|arri|)).
// Expected Auxiliary Space: O(max(|arri|)) for result.

// Constraints:
// 1 ≤ N ≤ 103
// 1 ≤ |arri| ≤ 103

class Solution {
    String longestCommonPrefix(String arr[], int n) {
        // code here
        Arrays.sort(arr);
        String start = arr[0];
        String last = arr[n - 1];
        int i = 0;
        while (i < start.length() && i < last.length()) {
            if (start.charAt(i) != last.charAt(i)) {
                break;
            }
            i++;
        }
        if (i == 0) {
            return "-1";
        } else {
            String ans = start.substring(0, i);
            return ans;
        }
    }
}