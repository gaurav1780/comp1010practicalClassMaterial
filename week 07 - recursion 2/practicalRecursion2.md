# Department of Computing, Macquarie University

## Workshop - Recursion (2)

# NOTE

This week we will be working purely on codingbat exercises:

- [Recursion 1](https://codingbat.com/java/Recursion-1), and only after you finish all of these,
- [Recursion 2](https://codingbat.com/java/Recursion-2)

Make sure you create an account and login before working on these exercises, otherwise your work will not be saved on the website.

For those who have already done all the exercises (which I doubt), you can *tail-optimize* as many as possible.

This is a chance for you to seek help from your tutors if you have trouble understanding recursion.

We will utilise *breakout rooms* for pair-programming where you are free to choose your partner. If there are an odd number of students, tutor will assign the last student left to a group.

Tutor will stay in the main channel and assist anyone who needs extra help, and will duck in and out of different breakout rooms to see if you need any guidance.

## Week 7 submission

TBA 

<!--You should be working with `Stage3.java` of package `practicePackage.recursion.attempts`. 

Each function is worth 12.5 marks. You must complete **at least** 3 functions from stage 3 to clear the hurdle for week 7.
Therefore, the passing mark for week 7 is 37.5. Completing 8 or more functions gets you a full 100 marks.

Drag and Drop `Stage3.java` (and ALSO `Stage1.java` if you call `power` in `powerV2`) from the package explorer into "Week 7 submission" submission box by **Sunday 25th April, 21:00**.

- Submit Stage3.java (and ALSO `Stage1.java` if you call `power` in `powerV2`) from the recursion package.
- There are a total of 10 functions in this stage. 
- You should implement all solutions PURELY recursively (absolutely no iteration). 
- IMPORTANT!!! Any use of any loop automatically disqualifies your submission.
- Any compilation error and/or any StackOverflowError disqualifies your submission.
- Each function is worth 12.5 marks. Thus, 8 or more functions passing the tests will get you a full mark.
- Your code should pass **AT LEAST 3 functions to pass the hurdle**. This will get you 37.5 out of 100.-->

<!--Compile all your codingbat solutions into one file, say, `RecursionCodingBat.java` and upload to [Week 7 submission](https://ilearn.mq.edu.au/mod/assign/view.php?id=6013521).

Template is below:

```java
public class RecursionCodingBat {
	//first example
	public int factorial(int n) {
  		if(n<=1) {
  			return 1;
  		}
  		return n * factorial(n-1);
	}
	
	//second example - tail optimized + proxy
	public int sumDigits(int n) { //proxy method
  		return sumDigitsTailOptimized(n, 0);
	}

	//tail optimized version
	public int sumDigitsTailOptimized(int n, int answer) {
		if(n==0) {
			return answer;
		}
		return sumDigitsTailOptimized(n/10, answer + n%10);
	}
}
```
-->
