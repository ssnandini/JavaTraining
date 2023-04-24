package com.dedalus.DPState;

public class DPStateTvRemoteAction {
	
	public static void main(String[] args) {
	      Situation situation = new Situation();

	      TurnOnState startTV = new TurnOnState();
	      startTV.performAction(situation);

	      System.out.println(situation.getState().toString());

	      TurnOffState stopTV = new TurnOffState();
	      stopTV.performAction(situation);

	      System.out.println(situation.getState().toString());
	   }

}
