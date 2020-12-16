package TP;

import TP.Tupla;

public class Tupla<T1, T2> {
	private T1 x;
	private T2 y;
	
	public Tupla (T1 t1, T2 t2) {
		x = t1;
		y = t2;
	}
	
	public T1 getX() {
		return x;
	}
	public T2 getY() {
		return y;
	}
	
	public void  setX (T1 t1) {
		x = t1;
	}
	
	public void setY (T2 t2) {
		y= t2;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tupla other = (Tupla) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} 
		else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
}