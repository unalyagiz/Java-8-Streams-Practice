# Java Streams API
 
This repository is cheatsheet of Java 8 Streams API to be remembered easily when it's needed. Methods that are required higher version of Java 8 might be covered partially, in that case it would be highlighted for you to notice.

<dl><dt><h2>Cheat Sheet</dt></dl>
Each title has link to source code of the defined code block.
 
[map/Map.java](../src/map/Map.java)
------


Here ```.map()``` function takes method reference ```String::length``` as argument. <br>
Also lambda expression ```course -> course.length()``` works too.

```java
package Streams.map;

public static void printLengthOfCourses(List<String> courses){
        courses.stream()
        .map(String::length)
        .forEach(System.out::println);
        }

```
