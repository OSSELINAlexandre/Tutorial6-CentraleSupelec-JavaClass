package Exercise2;

public class ShortestSide implements BehaviorStrat  {

	
	@Override
	public int compare(Shapes o1, Shapes o2) {
		
		if(o1.getSmallestSide() ==o2.getSmallestSide() )  
			return 0;  
		else if(o1.getSmallestSide() > o2.getSmallestSide() )  
			return 1;  
		else  
			return -1;  
	}

	
	
	
}
