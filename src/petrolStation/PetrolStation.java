package petrolStation;

import java.text.DecimalFormat;

public class PetrolStation implements IPetrolStation {
	
	private float fuelPrice;
	private float factor;
	private String name;

	public PetrolStation(IHeadQuarter hq, String name, float factor) {
		this.factor = factor;
		this.name = name;
		hq.registerPetrolStation(this);		
	}
	
	public void unregister(IHeadQuarter hq) {
		hq.unregisterPetrolStation(this);
	}

	public void updateFuelPrice(float basePrice) {
		// Bereken de prijs op basis van de winstfactor.
		this.fuelPrice = basePrice * factor;
		
		DecimalFormat df = new DecimalFormat("#.##");
		String displayPrice = df.format((double)(this.fuelPrice));
		
		System.out.println(this.name+" - brandstofprijs "+ displayPrice);
	}
	
	public String getName() {
		return name;
	}
}
