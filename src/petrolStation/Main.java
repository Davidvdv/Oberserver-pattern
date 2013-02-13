package petrolStation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HeadQuarter hq = new HeadQuarter();
		
		PetrolStation gouda = new PetrolStation("Tankstation Gouda", 1.7f);
		PetrolStation barendrecht = new PetrolStation("Tankstation Barendrecht", 1.6f);
		PetrolStation rotterdam = new PetrolStation("Tankstation Rotterdam", 1.5f);
		
		hq.registerPetrolStation(gouda);
		hq.registerPetrolStation(barendrecht);
		hq.registerPetrolStation(rotterdam);
		
		hq.setBasePrice(1.10f);
		
		hq.unregisterPetrolStation(barendrecht);
		hq.setBasePrice(1.15f);
	}

}
