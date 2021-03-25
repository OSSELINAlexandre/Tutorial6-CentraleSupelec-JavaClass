# Tutorial6-ECP
Sixth tutorial from CentraleSupelec - UML and Design Pattern : Design a class library for representing geometrical shapes + Extend the shape library project (developed in Exercise 1) so to equip the Shape library
with interchangeable sorting functionality for shape objects.

## My Resolution

For the second exercise, I used a Strategy Pattern Design. I specialized the Comparator<T> interface to a Comparator<Shapes> [Shapes is the interface defining all the different shapes in this tutorial]. A new developer, if the client ask for a new Strategy, just have to implement the method in the Shapes interface, and add a new class to the BehaviorStrategy interface. The new class has to override the compare method and organize as expected by the client.
Therefore, the Open-Close principle is respected : the client node doesn't have to manipulate or create new classes, and the code is reusable. 
