# Department of Computing, Macquarie University
## Workshop - Unit testing


# Outline 

1. Test quality
2. Sample mappings
3. Satisfying JUnit tests
4. Writing JUnit tests


# Test quality

When writing tests for a particular method, a set of input-output mappings is used to test the correctness of the method. This set should test as many scenarios as possible.

## Question 1

Consider a method that is supposed to return the number of even digits in an integer. Which of the following sets of sample inputs is the best?

1. 31, 255, 1
2. 240, 1080, 0, 42
3. 31, 65, 84, 29
4. 5782, 374, 18642, -7135342
5. 1, 589, 409512, -6158, 0

## Question 2

Consider a method that returns the number of odd numbers in an array. If one sample input is `{15, 7, 103}`, does a second sample input `{15, 103, 91}` offer any additional value? What about `{81, -25, 63}`?

## Question 3

Consider 