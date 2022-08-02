package tutorials;


public class PavanTutorial {

	public static void main(String[] args) {
		String[] roomMembers=new String[] {"Madhu","Ranjith","Gubre","Nayudu"};
		
		boolean doesMadhuKnowsCoding=false;
		//if statement
		if(doesMadhuKnowsCoding)
		{
			System.out.println("I am executing if is TRUE");
		}
		else {
			System.out.println("I am executing if is FALSE");
		}
		
		//switch condition
		int switchKey=112314;
		
		switch (switchKey) {
		case 1:{
			System.out.println("I am in swich case 1 of PVAN");
			break;
		}
		case 2:{
			System.out.println(" I am in swich case 2 MADHU");
		}
		default:{
			System.out.println(" I am in swich case DEFAULT with NO EMployee");
			break;
		}
		}
		
		//while statement looping
		
		/*
		 * while (doesMadhuKnowsCoding) {
		 * System.out.println("while madhu knows Coiding");
		 * //doesMadhuKnowsCoding=false; }
		 */
		// do while looping
		
		do {
			System.out.println("Prining in the do lOOP ");
		} while (doesMadhuKnowsCoding);
		
		//for Looping
		
		for(int i=0; i<roomMembers.length;i++) {
			System.out.println("ececuting in for loop for time "+ roomMembers[i]);
		}
		
		for(String roomMember:roomMembers) {
			System.out.println("ececuting in for loop EACH for time "+ roomMember);
		}
			
	}
}
