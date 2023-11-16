package com.lins.veiculo;

public class Carro {

	private String nome;
	private String marca;
	private int ano;
	private Motor motor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * Método que liga o motor
	 */
	public void ligarMotor() {
		this.motor.setMotor(true);
	}

	/**
	 * Método que desligar o motor
	 */
	public void desligarMotor() {
		this.motor.setMotor(false);

	}

	/**
	 * verifica se motor esta ligado
	 * 
	 * @return retorna estado do motor
	 */
	public boolean checkOn() {
		return this.motor.isMotor();

	}

}