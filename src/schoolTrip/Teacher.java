package schoolTrip;

import java.util.ArrayList;

public class Teacher implements ITeacher {
	
	private int startTime;
	private int group;
	private String name;
	
	// Teacher -> Parents
	private ArrayList<IParent> parents;

	@SuppressWarnings("unused")
	public Teacher(IHeadMaster hm, String name, int group) {
		
		this.name = name;
		this.group = group;
		hm.subscribeTeacher(this);		
		
		System.out.println("Nieuw leraar: " +this.name);
		
		parents = new ArrayList<IParent>();
		
		Parent ouderA = new Parent(this, "Ouder A", "agenda");
		Parent ouderB = new Parent(this, "Ouder B", "iphone");
		Parent ouderC = new Parent(this, "Ouder C", "planbord");
		
	}
	
	public void register(IHeadMaster hm) {
		hm.subscribeTeacher(this);
	}
	
	public void unregister(IHeadMaster hm) {
		hm.unsubscribeTeacher(this);
	}

	public void updateTime(int t) {
		
		this.startTime = t + ((group-1)*5);
				
		System.out.println(this.name+" gaat vertrekken om "+ this.startTime);
		
		notifyAllParents();
		
	}
	
	
	
		
	
	// Teacher -> Parent
	public void subscribeParent(IParent p) {
		parents.add(p);
	}

	// Teacher -> Parent
	public void unsubscribeParent(IParent p) {
		if(parents.contains(p)) {
			parents.remove(p);
		}
	}

	// Teacher -> Parent
	public void notifyAllParents() {
		for(IParent parent : parents) {
			parent.updateTime(this.startTime);
		}
	}	
	
	
	
	
	
	
}
