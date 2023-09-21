public class LifeSucessSimulator{

	// Try succeed in while you're no dead!
	public static void main(String args[]){
		Life myLife = new Life();
		myLife.startLife();

		while( !myLife.makeSuccess() ){
			myLife.tryAgain();
			if(myLife.death()){break;}
		}
	}
}
