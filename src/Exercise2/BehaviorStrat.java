package Exercise2;

import java.util.Comparator;

public interface BehaviorStrat extends Comparator<Shapes>{
	
	//Nothing is added to the Comparator : the purpose of this class is simply to have a common denomination
	//for different strategy. 
	//Therefore, for the Design Pattern, the new developer just has to implement this methods, and 
	//add a new behavior based on Shapes methods. If the client wants to have new strategy 
	//(e.g BiggestSideDifferenceinaShape), the developer has to create this new method in the Shapes interface, 
	//implements all these in the different classes of Shapes, and then create the BehaviorStrat with Comparator.
	
	//This pattern is usefull because the client doesn't have to have any knowledge of the code, and the given code can works.
	//It is therefore following the OPEN-CLOSE principle of Design Pattern. 
	
}
