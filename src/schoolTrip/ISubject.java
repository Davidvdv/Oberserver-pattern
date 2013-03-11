package schoolTrip;

public interface ISubject {
	void subscribeObserver(IObserver o);
	void unsubscribeObserver(IObserver o);
	void notifyObservers();
}
