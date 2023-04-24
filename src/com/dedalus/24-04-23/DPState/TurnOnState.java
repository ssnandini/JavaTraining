package com.dedalus.DPState;

public class TurnOnState implements TvRemoteState {

	   public void performAction(Situation situation) {
	      System.out.println("TV Remote is turned ON");
	      situation.setState(this);	
	   }

	   public String toString(){
	      return "Can see TV Programs ";
	   }
	}
