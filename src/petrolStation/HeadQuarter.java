package petrolStation;

import java.util.ArrayList;

public class HeadQuarter implements IHeadQuarter {
	
	private ArrayList<IPetrolStation> petrolStations;
	private float basePrice;

	public HeadQuarter() {
		petrolStations = new ArrayList<IPetrolStation>();
	}

	public void registerPetrolStation(IPetrolStation petrolStation) {
		petrolStations.add(petrolStation);
	}

	public void unregisterPetrolStation(IPetrolStation petrolStation) {
		petrolStations.remove(petrolStation);
	}

	public void notifyAllPetrolStations() {
		for(IPetrolStation petrolStation : petrolStations) {
			petrolStation.updateFuelPrice(this.basePrice);
		}
	}
	
	public float getBasePrice() {
		return this.basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
		notifyAllPetrolStations();
	}

}
