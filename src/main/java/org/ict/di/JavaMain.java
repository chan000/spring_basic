package org.ict.di;

public class JavaMain {

	public static void main(String[] args) {
		Singer singer = new Singer();
		Stage stage = new Stage(singer);
		
		Broadcast boardcast = new Broadcast(stage);
		boardcast.broad();
		stage.perform();
		singer.sing();
		
	}

}
