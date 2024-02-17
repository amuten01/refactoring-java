# Refactoring summary

## Key changes

Here are the key changes made:

    - Package path: 
      A package path was added for better code organization, maintainability, and scalability, while also promoting modularity, 
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

	- Diagrams
	  Added diagrams to enhance understanding of the use case and sequence

        
## Diagrams

	- Use case: Generate Rental Statement
	
![PKuv2W914Cph5Sta-m43sSp8HF41pMox3im1tRs2Y7zt9b03AweBgcPpLjzA1h9SdRoHflNcj2ILwAbLWACtfOk90iFakcQXS6pt97IIwfpf_32N4kW9wjXC8bll7AIAilzgtaNfF10RVTAlYnSmTcYQzl_fRdmmO9QwzCTl](https://github.com/amuten01/refactoring-java/assets/156481017/5c04f221-d003-4a10-acda-dd7444f7a871)
	
	
	- Sequence: Generate Rental Statement
	
![bLB1IiGm4BtdAuQUMj1-G43PfRZWOK4iVa38ZYNGJjPaehzlahPYj1Qy99FttioyP7Bmh1o7QHJY6WEZpLKHmraPAe1dV5MQhJCq7Bqt0qr8_4D1hCPEZJgCAYeBiWkUxOGbUBRl1kUqtxWGoGFStc-tbk0Kt07XnpPVDs8JJmLNC_8hggkkXPSM-dogRi1bLxuHgs8sKjvGme24JZ7s79V](https://github.com/amuten01/refactoring-java/assets/156481017/302a168d-634e-4de0-ba2f-ac2b2ee96ac1)




## To run the test:

```
javac src/main/java/com/etraveli/refactoring/*.java
java -cp src/main/java com.etraveli.refactoring.Main
```



