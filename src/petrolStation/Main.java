package petrolStation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HeadQuarter hq = new HeadQuarter();
		
		PetrolStation barendrecht = new PetrolStation(hq, "Tankstation Barendrecht", 1.6f);
		PetrolStation rotterdam = new PetrolStation(hq, "Tankstation Rotterdam", 1.5f);

		/* 1. Gouda wordt toegevoegd aan het hoofdkantoor */
		PetrolStation gouda = new PetrolStation(hq, "Tankstation Gouda", 1.7f);
		
		/* 2. Het hoofdkantoor zet de basisbrandstofprijs.*/
		hq.setBasePrice(1.10f);
		
		/* 3. Het tankstation wordt overgenomen en verdwijnt uit de Collection */
		barendrecht.unregister(hq);
		
		/* 4. De basisprijs wordt weer veranderd. */
		hq.setBasePrice(1.15f);
	}

}
