package com.dedalus.DPStrategy;

// Interface
interface CalcStrategy {
	 int doCalc(int a1, int a2);
	}

// Context
class Calc {
 private CalcStrategy strategy;
 
 public Calc(CalcStrategy strat) {
     this.strategy = strat;
 }
 
 public int calculator (int n1, int n2) {
	 return strategy.doCalc(n1, n2);
     
 }
}

// Concrete class - Addition
class Addition implements CalcStrategy {
 public int doCalc(int a1, int a2) {
	 return a1 + a2;	 
 }
}

// Concrete class - Multiplication
class Multiplication implements CalcStrategy {
 public int doCalc(int a1, int a2) {
    return a1 * a2;
     }
 }

//Strategy Calculation
public class DPStrategyCalc {
 public static void main(String[] args) {
      
	 CalcStrategy cs1 = new Addition();
	 Calc calc = new Calc(cs1);
     System.out.println("Addition: " + calc.calculator(10,20) );
     
     CalcStrategy cs2 = new Multiplication();
	 Calc calc1 = new Calc(cs2);
     System.out.println("Multiplication: " + calc1.calculator(10,20) );
 }
}
