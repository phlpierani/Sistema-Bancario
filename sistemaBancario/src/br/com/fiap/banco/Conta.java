package br.com.fiap.banco;

import java.io.Serializable;

/**
 * classe que abstrai uma conta bancaria
 * @author CLIENTE
 */

public class Conta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1l;
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		}
	
	public Conta(int agencia, int numero, double saldo) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * acrescenta valor ao saldo da conta
	 * @param valor que sera depositado
	 */
	public void depositar(double valor) {
		
		this.saldo = this.saldo + valor; 
	}
	
	
	/**
	 * retira valor ao saldo da conta
	 * @param valor que sera retirado
	 * @see depositar
	 */
	public void retirar (double valor) {
		this.saldo = this.saldo - valor;
	}
	
	
	/**
	 * verifica o saldo da conta
	 * @return valor do saldo da conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
