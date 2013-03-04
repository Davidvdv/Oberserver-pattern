package schoolTrip;

public interface IHeadMaster {
	
	void subscribeTeacher(ITeacher t);
	void unsubscribeTeacher(ITeacher t);
	void notifyAllTeachers();

}
