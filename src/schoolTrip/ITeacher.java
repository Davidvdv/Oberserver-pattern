package schoolTrip;

public interface ITeacher {
	
	void updateTime(int t);
	
	// Teacher -> Parents
	void subscribeParent(IParent p);
	void unsubscribeParent(IParent p);
	void notifyParents();
	
}
