package com.lins.veiculo;

public class Motor {
	
	private double potencia = 1.8;
	private boolean motor;
	
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	//------------------------------------------
	
	
	
	
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	
	
//	public void setLigado(boolean ligado) {
//		this.motor = ligado;
//	}
//	public void setDesligar(boolean desligado) {
//		this.motor = desligado;
//		
//	}
	
	
}