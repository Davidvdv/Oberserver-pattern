package schoolTrip;

import java.util.ArrayList;

public class HeadMaster implements IHeadMaster {

	private ArrayList<ITeacher> teachers;
	private int startTime;

	@SuppressWarnings("unused")
	public HeadMaster() {
		teachers = new ArrayList<ITeacher>();
		
		System.out.println("Nieuw schoolhoofd.");
		System.out.println("--- --- --- --- ---");		
		
		Teacher groep1 = new Teacher(this, "Groep 1", 1);
		System.out.println("--- --- --- --- ---");

		Teacher groep2 = new Teacher(this, "Groep 2", 2);
		System.out.println("--- --- --- --- ---");

		Teacher groep3 = new Teacher(this, "Groep 3", 3);
		System.out.println("--- --- --- --- ---");

		Teacher groep4 = new Teacher(this, "Groep 4", 4);
		System.out.println("--- --- --- --- ---");

		Teacher groep5 = new Teacher(this, "Groep 5", 5);
		System.out.println("--- --- --- --- ---");

		Teacher groep6 = new Teacher(this, "Groep 6", 6);
		System.out.println("--- --- --- --- ---");

		Teacher groep7 = new Teacher(this, "Groep 7", 7);
		System.out.println("--- --- --- --- ---");

		Teacher groep8 = new Teacher(this, "Groep 8", 8);
		System.out.println("--- --- --- --- ---");
		
	}

	public void subscribeTeacher(ITeacher t) {
		teachers.add(t);
	}

	public void unsubscribeTeacher(ITeacher t) {
		if(teachers.contains(t)) {
			teachers.remove(t);
		}
	}

	public void notifyTeachers() {
		for(ITeacher teacher : teachers) {
			teacher.updateTime(this.startTime);
		}
	}

	public void updateTimee(int t) {
		this.startTime = t;
		notifyTeachers();
	}
	
}
