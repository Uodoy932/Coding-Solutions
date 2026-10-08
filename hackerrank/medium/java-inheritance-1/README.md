# Java Static Initializer Block

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Using *inheritance*, one class can acquire the properties of others. Consider the following *Animal* class:

```java
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
```


This class has only one method, *walk*. Next, we want to create a *Bird* class that also has a *fly* method. We do this using *extends* keyword:

```java
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}
```

Finally, we can create a Bird object that can both *fly* and *walk*.

```java
public class Solution{
   public static void main(String[] args){

      Bird bird = new Bird();
      bird.walk();
      bird.fly();
   }
}
```

The above code will print:

    I am walking
    I am flying

This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.

The code above is provided for you in your editor. You must add a *sing* method to the *Bird* class, then modify the *main* method accordingly so that the code prints the following lines:

    I am walking
    I am flying
    I am singing

**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T15:52:52.512Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    static int a;
    static int b;
    static boolean flag;
    
    static{
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        
        if(a > 0 && b > 0){
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
       
        if(flag){
            System.out.println(a*b);
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-inheritance-1/problem)