package schoolTrip;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		HeadMaster schoolhoofd = new HeadMaster();
		System.out.println("===== =====");
		
		Teacher groep1 = new Teacher(schoolhoofd, "Groep 1", 1);
		Teacher groep2 = new Teacher(schoolhoofd, "Groep 2", 2);
		Teacher groep3 = new Teacher(schoolhoofd, "Groep 3", 3);
		Teacher groep4 = new Teacher(schoolhoofd, "Groep 4", 4);
		Teacher groep5 = new Teacher(schoolhoofd, "Groep 5", 5);
		Teacher groep6 = new Teacher(schoolhoofd, "Groep 6", 6);
		Teacher groep7 = new Teacher(schoolhoofd, "Groep 7", 7);
		Teacher groep8 = new Teacher(schoolhoofd, "Groep 8", 8);
		System.out.println("===== =====");
		
		schoolhoofd.updateTimee(800);
		System.out.println("===== =====");
		
		schoolhoofd.updateTimee(900);
		System.out.println("===== =====");
		
		
		
	}

}
