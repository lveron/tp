package TP;

import java.util.ArrayList;

import TP.Conjunto;
import TP.Tupla;

public class Diccionario <C,V> {
	private ArrayList <Tupla<C,V>> entradas;

	public Diccionario() {
		entradas = new ArrayList <Tupla<C,V>>();
	}
	public void definir(C clave, V valor) {
		if(!estaDefinida(clave)) {
			this.entradas.add(new Tupla<C,V>(clave, valor));
		}
		else {
			//si se encontro la clave ya definida se reemplaza el valor
			for (int i=1; i<tamanio(); i++) {
				if (entradas.get(i).getX().equals(clave)) {
					entradas.get(i).setY(valor);
				}
			}
		}
		
	}
	
	public boolean estaDefinida(C clave) {
		boolean existe = false;
		for (int i=0; i<tamanio(); i++) {
			existe = existe || entradas.get(i).getX().equals(clave);
			}
		return existe;
	}
	
	public int tamanio() {
		return this.entradas.size();
	}
	
	public void eliminar (C clave) {
		for (int i=0; i<tamanio(); i++) {
			if (entradas.get(i).getX().equals(clave)) {
				this.entradas.remove(i);
			}
		}
	}
	
	public V definicion (C clave) {
		for (int i=0; i<tamanio(); i++) {
			if (entradas.get(i).getX().equals(clave)) {
				return entradas.get(i).getY();
			}
		}
		return null;
	}
	
	public Conjunto<C> Claves(){
		return new Conjunto<C>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}