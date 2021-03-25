package Exercise2;

public class LongestSide implements BehaviorStrat  {
	
	
	@Override
	public int compare(Shapes o1, Shapes o2) {
		
		if(o1.getBiggestSide() ==o2.getBiggestSide() )  
			return 0;  
		else if(o1.getBiggestSide() > o2.getBiggestSide())  
			return 1;  
		else  
			return -1;  
	}

	
	

}
