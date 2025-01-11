package com.driver;

public class Main {
    public static void main(String[] args) {
      // Task 3: Create an object of RWOnly 
      RWOnly obj = new RWOnly(); 
        // Task 4: Try to set and access the name directly
        // obj.name = "Test"; // Error: 'name' has private access in 'com.driver.RWOnly'
        // Task 6: Use setter and getter
        obj.setName("Lavanya"); // Setting value using setter
        System.out.println("Name: " + obj.getName()); 
    }
}
