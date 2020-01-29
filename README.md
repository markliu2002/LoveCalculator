# LoveCalculator


## Project Description
  - Love Calculator developed in Java

## Algorithm:
  1. Take the names of the two people (e.g. Jimmy and Jennifer).
  2. Convert the letters to all uppercase characters (e.g. JIMMY and JENNIFER).
  3. Eliminate any repetitive letters that occur in each name. So, for example, JIMMY would be changed to JIMY. JENNIFER to JENIFR.
  4. Concatenate the two names (e.g. JIMYJENIFR).
  5. Convert each letter in the concatenated names to an int (i.e. ASCII values). So, the letter A for example would be 65, B equals 66, etc.
  6. Add together all the ASCII values for each character and calculate the remainder when dividing by 101.
  7. The remainder is the love percentage.
  8. Be sure to deal with the situation where the user enters numbers instead of letters.




### Installation


```sh
$ cd LoveCalculator
$ javac love_calculator.java
$ java love_calculator
```

