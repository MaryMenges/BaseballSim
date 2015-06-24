package feildingPackage;
import teamPackage.Player;


public class FieldSquare {
	
private boolean hasBall;
private String key;
private int[] playerSpace;
private Player fielder;

public FieldSquare(){
	setHasBall(false);
}

public FieldSquare(boolean ball, String position){
	setHasBall(ball);
	setKey(position, 10);
}

public void setSize(int size){
	playerSpace = new int[size];
}

public boolean getHasBall() {
	return hasBall;
}

public void setHasBall(boolean hasBall) {
	this.hasBall = hasBall;
}

public String getKey() {
	return key;
}

public void setKey(String key, int size) {
	this.key = key;
	playerSpace = new int[size];
}

public Player getFielder() {
	return fielder;
}

public void setFielder(Player fielder) {
	this.fielder = fielder;
	for(int i = 0; i < playerSpace.length; i++){
		playerSpace[i] = (int)(fielder.getFP()*100) - i;
	
	}
}

public boolean wasBallCaught(){
	int temp = (int)(Math.random() * (playerSpace.length-1));
	int temp2 = (int)(Math.random() * 100);
	if(temp2 > (100 - playerSpace[temp])){
		return true;
	}
	else return false;
}

}