package com.calculadora.abst;

public abstract class Calculadora {
	
	static double r;
	static private double a, b;
	 
	public static double sumar(double x, double y){
		r=x+y;
		return r;
	}
	public static double restar(double x, double y){
		r=x-y;
		return r;
	}
	
	public static double multiplicar(double x, double y){
		r=x*y;
		return r;
	}
	
	public static double division(double x, double y){
		r=x/y;
		return r;
	}
	
	
	public Calculadora() {
		
	}
	
	
	/*public double sumar2() {
		return getA()+getB();
	}
	
	//da error porque un metodo static no puede hacer referencia a las palabras reservadas "this"
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}*/
	
	/*public Calculadora(double a1, double b1){
	this.a=a1;
	this.b=b1;
	}*/
}
