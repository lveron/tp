package TP;

//Clase Fecha Java
public class Fecha {

  private int dia;
  private int mes;
  private int a�o;

  //Constructor por defecto
  public Fecha() {
  }

  //Constructor con par�metros
  public Fecha(int dia, int mes, int a�o) {
	  	if (dia < 1 || dia>31) {
	  		throw new RuntimeException ("El dia debe estar entre 1 y 31");
	  	}
	  	else if ( mes < 1 || mes > 12) {
	  		throw new RuntimeException ("El mes debe estar entre 1 y 12");
	  	}
	  	else if (a�o < 0) {
	  		throw new RuntimeException ("El a�o debe ser mayor 0");
	  	}
      this.dia = dia;
      this.mes = mes;
      this.a�o = a�o;
  }
  
  public String toString () {
	  return dia + "/" + mes + "/" + a�o;
  }

  //para ingresar fechas de alta a internaciones
  public boolean FechaAltaEsMayorQueFechaIngreso (Fecha fechaAlta) {
	  if (fechaAlta.getMes()== this.mes && fechaAlta.getDia()> this.dia || fechaAlta.getMes()> this.mes) {
		  return true;
	  }
	  else {
		 return false;
	  }

  }
  
  
  //setters y getters
  public void setDia(int d) {
      dia = d;
  }
  public void setMes(int m) {
      mes = m;
  }
  public void setA�o(int a) {
      a�o = a;
  }
  public int getDia() {
      return dia;
  }
  public int getMes() {
      return mes;
  }
  public int getA�o() {
      return a�o;
  }
  
  
//no llegamos a implementarlo
public static Fecha hoy() {
	return null;
}


}