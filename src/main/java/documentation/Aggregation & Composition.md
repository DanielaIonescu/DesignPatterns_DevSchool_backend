###Aggregation & Composition
In both aggregation and composition object of one class "owns" object of another class. 

But there is a subtle difference:
- Aggregation implies a relationship where the child can exist independently of the parent. 
  - Example: Class (parent) and Student (child). Delete the Class and the Students still exist.
- Composition implies a relationship where the child cannot exist independent of the parent. 
  - Example: House (parent) and Room (child). Rooms don't exist separate to a House.

![The diamond shape is near the parent class.](../../resources/Aggregation.png "Agregation")

![The diamond shape is near the parent class.](../../resources/Composition.png "Composition")