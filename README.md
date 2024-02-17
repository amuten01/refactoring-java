## Refactoring summary

Here are the key changes made:

    - Package path: 
      Added a package path for better code organization, maintainability, and scalability, while also promoting modularity, 
      encapsulation, and reusability.    

    - RentalCalculator Class: 
      A new class RentalCalculator is introduced to encapsulate the rental calculation logic.
    
    - Use of StringBuilder: 
      Changed the concatenation of strings to use StringBuilder for better performance.
    
    - Static Initialization Block: 
      Initialized the movies map using a static initialization block for clarity.
      
    - Methods for Calculation: 
      Introduced private methods within RentalCalculator to calculate rental amount and frequent enter points.
    
    - Switch Statement: 
      Used a switch statement in calculateRentalAmount method for clarity and maintainability.


## To run the test:

```
javac src/main/java/com/etraveli/refactoring/*.java
java -cp src/main/java com.etraveli.refactoring.Main
```
