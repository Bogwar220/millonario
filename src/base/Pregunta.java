package base;

import java.io.Serializable;

public class Pregunta implements Serializable{
	
	String pregunta;
	String opcionA;
	String opcionB;
	String opcionC;
	String opcionD;
	int good;
	int correcto;
	
	public Pregunta(String pregunta, String opcionA,String opcionB, String opcionC, String opcionD, int good,int correcto) {
		this.pregunta = pregunta;
		this.opcionA = opcionA;
		this.opcionB = opcionB;
		this.opcionC = opcionC;
		this.opcionD = opcionD;
		this.good=good;
		this.correcto=correcto;
	}
	
	public int getCorrecto() {
		return correcto;
	}

	public void setCorrecto(int correcto) {
		this.correcto = correcto;
	}

	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public Pregunta() {
		
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getOpcionA() {
		return opcionA;
	}

	public void setOpcionA(String opcionA) {
		this.opcionA = opcionA;
	}

	public String getOpcionB() {
		return opcionB;
	}

	public void setOpcionB(String opcionB) {
		this.opcionB = opcionB;
	}

	public String getOpcionC() {
		return opcionC;
	}

	public void setOpcionC(String opcionC) {
		this.opcionC = opcionC;
	}

	public String getOpcionD() {
		return opcionD;
	}

	public void setOpcionD(String opcionD) {
		this.opcionD = opcionD;
	}
	
		
}
