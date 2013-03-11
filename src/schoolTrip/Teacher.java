package schoolTrip;

import java.util.ArrayList;

public class Teacher implements ISubject, IObserver {
	
	private int startTime;
	private int group;
	private String name;
	
	// Teacher -> Parents
	private ArrayList<IObserver> parents;

	@SuppressWarnings("unused")
	public Teacher(ISubject hm, String n, int g) {

		this.name = n;
		this.group = g;
		hm.subscribeObserver(this);		
		
		System.out.println("Nieuw leraar: " +this.name);
		
		this.parents = new ArrayList<IObserver>();
		
		Parent ouderA = new Parent(this, "Ouder A", Parent.Agenda.Planboard);
		Parent ouderB = new Parent(this, "Ouder B", Parent.Agenda.Agendaboekje);
		Parent ouderC = new Parent(this, "Ouder C", Parent.Agenda.Smartphone);
		
	}
	
	public void register(ISubject hm) {
		hm.subscribeObserver(this);
	}
	
	public void unregister(ISubject hm) {
		hm.unsubscribeObserver(this);
	}

	public void updateTime(int t) {
		
		this.startTime = t + ((group-1)*5);
				
		System.out.println(this.name+" gaat vertrekken om "+ this.startTime);
		
		notifyObservers();
		
	}
	
	// Teacher -> Parent
	public void subscribeObserver(IObserver p) {
		parents.add(p);
	}

	// Teacher -> Parent
	public void unsubscribeObserver(IObserver p) {
		if(parents.contains(p)) {
			parents.remove(p);
		}
	}

	// Teacher -> Parent
	public void notifyObservers() {
		for(IObserver parent : parents) {
			parent.updateTime(this.startTime);
		}
	}	
	
}
