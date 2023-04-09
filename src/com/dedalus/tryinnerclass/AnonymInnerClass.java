package com.dedalus.tryinnerclass;
import java.awt.*;
import java.awt.event.*;
class AnonymInnerClass 
{
 	private Frame f;
 	public AnonymInnerClass() 	{
     		f = new Frame("Hello .....!");
 	}
 	public void launchFrame() 
	{
 		f.setSize(170,170);
	 	f.setBackground(Color.blue);
	 	f.setVisible(true);	
	// Add a window listener
	
	 f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	});   //Anonymous Inner Classes 

	 }



 	public static void main(String args[]) 
	{
		AnonymInnerClass f = new AnonymInnerClass();
		f.launchFrame();
	}
}
