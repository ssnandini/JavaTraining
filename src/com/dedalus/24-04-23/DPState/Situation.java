package com.dedalus.DPState;

public class Situation {
	   private TvRemoteState remstate;

	   public Situation(){
		   remstate = null;
	   }

	   public void setState(TvRemoteState stateArg){
	      this.remstate = stateArg;		
	   }

	   public TvRemoteState getState(){
	      return remstate;
	   }
	}
