# Department of Computing, Macquarie University

## Workshop - Recursion (2)

# NOTE

This week we will be working purely on codingbat exercises:

- [Recursion 1](https://codingbat.com/java/Recursion-1), and only after you finish all of these,
- [Recursion 2](https://codingbat.com/java/Recursion-2)

Make sure you create an account and login before working on these exercises, otherwise your work will not be saved on the website.

For those who have already done all the exercises (which I doubt), you can *tail-optimize* as many as possible.

This is a chance for you to seek help from your tutors if you have trouble understanding recursion.

We will utilize *breakout rooms* for pair-programming where you are free to choose your partner. If there are an odd number of students, tutor will assign the last student left to a group.

Tutor will stay in the main channel and assist anyone who needs extra help, and will duck in and out of different breakout rooms to see if you need any guidance.

Week 7 submission

Compile all your codingbat solutions into one file, say, `RecursionCodingBat.java` and upload to [Week 7 submission](https://ilearn.mq.edu.au/mod/assign/view.php?id=6013521).

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