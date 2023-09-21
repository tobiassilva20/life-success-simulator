public class Life {
	private boolean isAlive = false;

	public void startLife(){
		isAlive = true;
	}

	public boolean makeSuccess(){
		if(Math.random()*10 > 9){
			System.out.println("Yeah, you've made it! ;)");
			return true;
		}
		return false;
	}

	public void tryAgain(){
		System.out.println("Trying again!");
	}

	private boolean toLive(){
		if(Math.random()*10 > 1){
			return false;
		}else{
			System.out.println("You died! :(");
			return true;
		}
	}

	public boolean death(){
		isAlive = toLive();
		return isAlive;
	}


}
