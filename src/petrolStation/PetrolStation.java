package petrolStation;

import java.text.DecimalFormat;

public class PetrolStation implements IPetrolStation {
	
	private float fuelPrice;
	private float factor;
	private String name;

	public PetrolStation(String name, float factor) {
		this.factor = factor;
		this.name = name;
	}

	public void updateFuelPrice(float basePrice) {
		this.fuelPrice = basePrice * factor;
		
		DecimalFormat df = new DecimalFormat("#.##");
		String displayPrice = df.format((double)(this.fuelPrice));
		
		System.out.println(this.name+" - brandstofprijs "+ displayPrice);
	}
	
	public String getName() {
		return name;
	}
}
