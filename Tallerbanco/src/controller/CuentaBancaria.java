package controller;

import java.util.List;

public class CuentaBancaria {

		public String nombresTitular; 
		public String apellidosTitular;
		int numeroCuenta=0;
		public String tipoCuenta;
		Float Saldo;
		
		public CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, String tipoCuenta,
				Float saldo) {
			super();
			this.nombresTitular = nombresTitular;
			this.apellidosTitular = apellidosTitular;
			this.numeroCuenta = numeroCuenta;
			this.tipoCuenta = tipoCuenta;
			Saldo = saldo;
		}

		public String getNombresTitular() {
			return nombresTitular;
		}

		public void setNombresTitular(String nombresTitular) {
			this.nombresTitular = nombresTitular;
		}

		public String getApellidosTitular() {
			return apellidosTitular;
		}

		public void setApellidosTitular(String apellidosTitular) {
			this.apellidosTitular = apellidosTitular;
		}

		public int getNumeroCuenta() {
			return numeroCuenta;
		}

		public void setNumeroCuenta(int numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}

		public String getTipoCuenta() {
			return tipoCuenta;
		}

		public void setTipoCuenta(String tipoCuenta) {
			this.tipoCuenta = tipoCuenta;
		}

		public Float getSaldo() {
			return Saldo;
		}

		public void setSaldo(Float saldo) {
			Saldo = saldo;
		}

		public CuentaBancaria(String text, String text2, String text3) {
			// TODO Auto-generated constructor stub
		}

		public static void add(List<CuentaBancaria> cuenta1) {
			// TODO Auto-generated method stub
			
		}
		
		

	

}
