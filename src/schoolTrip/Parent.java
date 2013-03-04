package schoolTrip;

public class Parent implements IParent {

	private int startTime;
	private String agenda;
	private String name;

	public Parent(ITeacher t, String name, String agenda) {
		
		this.name = name;
		this.agenda = agenda;
		t.subscribeParent(this);		
		
		System.out.println("--- Nieuw ouder: " +this.name);

	}
	
	public void register(ITeacher t) {
		t.subscribeParent(this);
	}
	
	public void unregister(ITeacher t) {
		t.unsubscribeParent(this);
	}

	public void updateTime(int t) {
		
		this.startTime = t;
		
		System.out.println("--- "+this.name+" noteert "+ this.startTime + " in "+ this.agenda);
		
	}
	
}
