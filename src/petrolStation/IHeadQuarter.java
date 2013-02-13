package petrolStation;

public interface IHeadQuarter {
	void registerPetrolStation(IPetrolStation petrolStation);
	void unregisterPetrolStation(IPetrolStation petrolStation);
	void notifyAllPetrolStations();
}
