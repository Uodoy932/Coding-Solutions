# Java Method Overriding 2 (Super Keyword)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using **super** keyword. If you write *super.func()* to call the function *func()*, it will call the method that was defined in the superclass.

You are given a partially completed code in the editor. Modify the code so that the code prints the following text:

    Hello I am a motorcycle, I am a cycle with an engine.
    My ancestor is a cycle who is a vehicle with pedals.


**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T04:37:06.302Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem)