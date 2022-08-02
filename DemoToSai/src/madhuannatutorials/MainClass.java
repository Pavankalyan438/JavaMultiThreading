package madhuannatutorials;

import tutorials.PavanTutorial;

public class MainClass extends PavanTutorial{

	public static void main(String[] args) {
		PublicClassDemo publicDemo=new PublicClassDemo();
		PavanTutorial ptut=new PavanTutorial();
		
		
		MainClass mc=new MainClass();
		
		publicDemo.defaultMethod();
		publicDemo.publicMethod();
		publicDemo.protectedMethod();
		
		
		
	}

}
