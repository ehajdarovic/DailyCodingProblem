# DailyCodingProblems
This is where I will put my daily coding for interesting practice problems I find.

### Problem 1

Source: https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/

Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1.

Example 1:<br/>
Input: nums = [1,2]<br/>

startvalue=1<br/>
1+1=2 -> 2+2=4<br/>

Output: 1<br/>
Explanation: Minimum start value should be positive. <br/>

Example 2:<br/>
Input: nums = [1,-2,-3]<br/>

startvalue=1<br/>
1+1=2 -> 2+(-2)=0 <br/>

startvalue=2<br/>
2+(-1)=1 -> 1+(-2)=-1 

startvalue=3<br/> 
3+(1)=4 -> 4+(-2)=2 -> 2+(-3)=-1 <br/>

startvalue=4<br/>
4+(1)=5 -> 5+(-2)=3 -> 3+(-3)=0<br/>

startvalue=5<br/>
5+(1)=6 -> 6+(-2)=4 -> 4+(-3)=1<br/>
Output: 5<br/>
 
 
[Solution](solutions/p1.java)
 
 
### Problem 2

Source: https://www.dailycodingproblem.com/

This problem was asked by Amazon.

Write a function that takes a natural number as input and returns the number of digits the input has.

Constraint: don't use any loops.

[Solution](solutions/p2.java)


### Problem 3

Source: https://www.dailycodingproblem.com/

This problem was asked by Facebook.

Given a list of integers L, find the maximum length of a sequence of consecutive numbers that can be formed using elements from L.

For example, given L = [5, 2, 99, 3, 4, 1, 100], return 5 as we can build a sequence [1, 2, 3, 4, 5] which has length 5.

[Solution](solutions/p3.java)


### Problem 4

Source: https://www.dailycodingproblem.com/

This problem was asked by Amazon.

Given a sorted array arr of distinct integers, return the lowest index i for which arr[i] == i. Return null if there is no such index.

For example, given the array [-5, -3, 2, 3], return 2 since arr[2] == 2. Even though arr[3] == 3, we return 2 since it's the lowest index.

[Solution](solutions/p4.java)

