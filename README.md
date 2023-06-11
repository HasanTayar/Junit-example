# Junit-example

This project consists of two simple classes, `User` and `Main`, and their respective Junit test classes, `UserTest` and `MainTest`.

The `src` directory is structured as follows:
src
|
└───com
└───example
├───Main.java
├───User.java
test
|
├───MainTest.java
└───UserTest.java

## Main.java

The `Main` class prompts the user to input a name and age via the console, then uses these inputs to create a new `User` object.

## User.java

The `User` class is a simple POJO (Plain Old Java Object) with two properties: `name` and `age`. It includes getter and setter methods for these properties.

## MainTest.java

The `MainTest` class is a JUnit test for the `Main` class. It tests the `createUser` method, verifying that the method creates `User` objects correctly.

## UserTest.java

The `UserTest` class is a JUnit test for the `User` class. It tests the getter and setter methods, ensuring that they function as expected.

## Installation

This project requires Java and JUnit to run. If you are using an IDE like IntelliJ or Eclipse, they should come with built-in support for JUnit.

## Usage

Simply clone the repository and open it in your preferred Java IDE. Run the `Main` class to start the program, and run the test classes to execute the JUnit tests.
