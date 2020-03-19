 import controller.ControlOperation;
import view.Interface;

public class Main {

	public static void main(String[] args) {
		while(true) {
			//VUE
			Interface view = new Interface();
		
			//controller
			ControlOperation controller = new ControlOperation(view);
			
			view.setControl(controller);
			view.afficher();
		}
	}

}
