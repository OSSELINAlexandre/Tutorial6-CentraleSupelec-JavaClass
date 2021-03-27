package Exercise2;

import java.util.ArrayList;
import java.util.Collections;

public class MyListingSorting {
	
	private ArrayList<Shapes> list;
	private BehaviorStrat behavior;
	
	
	public MyListingSorting(ArrayList<Shapes> list, BehaviorStrat b) {
		super();
		if(!list.isEmpty()) {
			this.list = list;
			behavior = b;
		}else {
			System.out.println("The given list is empty.");
		}
	}


	public ArrayList<Shapes> getList() {
		return list;
	}


	public void setList(ArrayList<Shapes> list) {
		this.list = list;
	}


	public BehaviorStrat getbehavior() {
		return behavior;
	}


	public void setbehavior(BehaviorStrat b) {
		behavior = b;
	}
	
	public ArrayList<Shapes> sortingTheList(){
		
		Collections.sort(list, behavior);
		return list;
	}
	

}
