package org.ict.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Broadcast {
	
	@Autowired
	public Stage stage;
	
	public Broadcast(Stage stage) {
		this.stage = stage;
	}
	public void broad() {
		System.out.println("방송 송출용");
	}
	
}
