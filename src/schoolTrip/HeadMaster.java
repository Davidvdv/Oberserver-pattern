package schoolTrip;

import java.util.ArrayList;

public class HeadMaster implements IHeadMaster {

	private ArrayList<ITeacher> teachers;
	private int startTime;

	public HeadMaster() {
		teachers = new ArrayList<ITeacher>();

		System.out.println("Nieuw schoolhoofd.");

	}

	public void subscribeTeacher(ITeacher t) {
		teachers.add(t);
	}

	public void unsubscribeTeacher(ITeacher t) {
		if(teachers.contains(t)) {
			teachers.remove(t);
		}
	}

	public void notifyAllTeachers() {
		for(ITeacher teacher : teachers) {
			teacher.updateTime(this.startTime);
		}
	}

	public void updateTimee(int t) {
		this.startTime = t;
		notifyAllTeachers();
	}
	
}
