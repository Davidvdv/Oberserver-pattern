package schoolTrip;

public interface ITeacher {
	
	// HeadMaster -> Teacher
	void updateTime(int t);
	
	// Teacher -> Parents
	void subscribeParent(IParent p);
	void unsubscribeParent(IParent p);
	void notifyAllParents();
	
}
