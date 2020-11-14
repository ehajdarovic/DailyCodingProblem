# DailyCodingProblems
This is where I will put my daily coding for interesting practice problems I find or make on my own!

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


### Problem 5

Source: https://www.dailycodingproblem.com/

This problem was asked by Microsoft.

Given an array of numbers arr and a window of size k, print out the median of each window of size k starting from the left and moving right by one position each time.

For example, given the following array and k = 3:

[-1, 5, 13, 8, 2, 3, 3, 1]
Your function should print out the following:<br/>

5 <- median of [-1, 5, 13]<br/>
8 <- median of [5, 13, 8]<br/>
8 <- median of [13, 8, 2]<br/>
3 <- median of [8, 2, 3]<br/>
3 <- median of [2, 3, 3]<br/>
3 <- median of [3, 3, 1]<br/>


[Solution](solutions/p5.java)


### Problem 6

Source: https://www.dailycodingproblem.com/

This problem was asked by Nextdoor.

Implement integer division without using the division operator. Your function should return a tuple of (dividend, remainder) and it should take two numbers, the product and divisor.

For example, calling divide(10, 3) should return (3, 1) since the divisor is 3 and the remainder is 1.

Bonus: Can you do it in O(log n) time?


[Solution](solutions/p6.java)


### Problem 6

Source: me

Make a program that gives users their zodiac sign after they enter the numerical month and day. Implement a formula that will allow compiler to find zodiac sign with the least steps as possible. 


[Solution](solutions/p7.java)


