package schoolTrip;

public class Parent implements IObserver {

	private int startTime;
	private Agenda agenda;
	private String name;
	
	public static enum Agenda {
		Smartphone,
		Planboard,
		Agendaboekje
	}

	public Parent(ISubject t, String name, Agenda agenda) {
		
		this.name = name;
		this.agenda = agenda;
		t.subscribeObserver(this);		
		
		System.out.println("--- Nieuw ouder: " +this.name);

	}
	
	public void register(ISubject t) {
		t.subscribeObserver(this);
	}
	
	public void unregister(ISubject t) {
		t.unsubscribeObserver(this);
	}

	public void updateTime(int t) {
		
		this.startTime = t;
		
		if(Parent.Agenda.Smartphone.equals(this.agenda)) {
			System.out.println("--- "+this.name+" noteert "+ this.startTime + " voert het in de "+ this.agenda);
		}
		
		if(Parent.Agenda.Planboard.equals(this.agenda)) {
			System.out.println("--- "+this.name+" noteert "+ this.startTime + " schrijft het op met een krijtje op het "+ this.agenda);
		}
		
		if(Parent.Agenda.Agendaboekje.equals(this.agenda)) {
			System.out.println("--- "+this.name+" noteert "+ this.startTime + " schrijft het in het "+ this.agenda);
		}
	}
	
}
