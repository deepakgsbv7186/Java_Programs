class Player{
 Player(){
	System.out.println("Two types of Player working in this program");
	}
 public void Display_Info(){
	System.out.println("Both the Players play with balls");
	}
}

class Cricket_Player extends Player{
 Cricket_Player(){
	System.out.println("Cricket team has 11 players.");
	}
  public void Display_Info(){
	System.out.println("Play with small white ball. ");
	}
}

class Football_Player extends Player{
 Football_Player(){
	System.out.println("Football team has 11 players.");
	}
  public void Display_Info(){
	System.out.println("Play with large ball. ");
	}
}

class plays{
public static void main(String args[]){
Player p=new Player();
p.Display_Info();
Cricket_Player cp=new Cricket_Player();
cp.Display_Info();
Football_Player fp=new Football_Player();
fp.Display_Info();

 }
}