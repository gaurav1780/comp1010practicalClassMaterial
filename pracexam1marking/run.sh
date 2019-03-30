#!/bin/bash
#usage: ./run.sh

for ((k=1; k<=5; k++)); do
  echo "Question"$k
  javac -cp .:junit-4.12.jar Question$k.java
  java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Question$k
  rm Question$k.java
done

rm *.class
