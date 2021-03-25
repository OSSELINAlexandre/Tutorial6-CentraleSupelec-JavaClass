package Exercise2;

public class ShortestPerimeter implements BehaviorStrat{


	@Override
	public int compare(Shapes o1, Shapes o2) {
		
		if(o1.getPerimeter()==o2.getPerimeter())  
			return 0;  
		else if(o1.getPerimeter()>o2.getPerimeter())  
			return 1;  
		else  
			return -1;  
	}

	
	
}
