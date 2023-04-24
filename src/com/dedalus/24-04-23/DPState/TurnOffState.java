package com.dedalus.DPState;

public class TurnOffState implements TvRemoteState {

	   public void performAction(Situation situation) {
	      System.out.println("TV Remote is turned OFF");
	      situation.setState(this);	
	   }

	   public String toString(){
	      return "Can't see TV Programs ";
	   }
	}
