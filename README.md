# Seconds and Minutes Converter in Java

The Seconds and Minutes Converter is a Java application designed to showcase method overloading by converting time into a formatted string. This project includes two functions: one that converts seconds into a formatted time string "XXh YYm ZZs", and another that takes minutes and seconds as parameters to produce the same formatted output. The first function leverages the second to accomplish its task, demonstrating the efficient reuse of code through overloading.

## Overview

This converter is an excellent tool for understanding how method overloading allows multiple methods to share the same name but differ in their parameter lists. It provides a practical example of how overloading can be used to enhance code readability and reuse, by formatting time in a human-readable format using two different sets of input parameters.

## Features

- **Formatted Time Output**: Outputs time in the format "XXh YYm ZZs", where XX represents hours, YY minutes, and ZZ seconds.
- **Method Overloading**: Demonstrates the use of method overloading to handle different input parameters while producing a similar output format.
- **Efficient Code Reuse**: The first function calls the second function to avoid code duplication and streamline the conversion process.

## Implementation

The Seconds and Minutes Converter includes two overloaded methods:
1. The first method accepts an integer representing seconds and converts it into the formatted string.
2. The second method takes two integers, minutes and seconds, and produces the formatted time string. The first method utilizes this method to convert the total seconds into the desired format.
