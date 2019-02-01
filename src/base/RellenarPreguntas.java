package base;

import java.util.ArrayList;

public class RellenarPreguntas {

	public static Pregunta rellenar(int cont) {	
		Pregunta pregunta = new Pregunta();
		
		switch(cont) {
		case 1:
			pregunta.setPregunta("Pregunta 1");
			pregunta.setOpcionA("opcion1A");
			pregunta.setOpcionB("opcion1B");
			pregunta.setOpcionC("opcion1C");
			pregunta.setOpcionD("opcion1D");
			pregunta.setGood(1);
			break;
		case 2:
			pregunta.setPregunta("Pregunta 2");
			pregunta.setOpcionA("opcion2A");
			pregunta.setOpcionB("opcion2B");
			pregunta.setOpcionC("opcion2C");
			pregunta.setOpcionD("opcion2D");
			pregunta.setGood(2);
			break;
		case 3:
			pregunta.setPregunta("Pregunta 3");
			pregunta.setOpcionA("opcion3A");
			pregunta.setOpcionB("opcion3B");
			pregunta.setOpcionC("opcion3C");
			pregunta.setOpcionD("opcion3D");
			pregunta.setGood(3);
			break;
		case 4:
			pregunta.setPregunta("Pregunta 4");
			pregunta.setOpcionA("opcion4A");
			pregunta.setOpcionB("opcion4B");
			pregunta.setOpcionC("opcion4C");
			pregunta.setOpcionD("opcion4D");
			pregunta.setGood(4);
			break;
		case 5:
			pregunta.setPregunta("Pregunta 5");
			pregunta.setOpcionA("opcion5A");
			pregunta.setOpcionB("opcion5B");
			pregunta.setOpcionC("opcion5C");
			pregunta.setOpcionD("opcion5D");
			pregunta.setGood(1);
			break;
		case 6:
			pregunta.setPregunta("Pregunta 6");
			pregunta.setOpcionA("opcion6A");
			pregunta.setOpcionB("opcion6B");
			pregunta.setOpcionC("opcion6C");
			pregunta.setOpcionD("opcion6D");
			pregunta.setGood(2);
			break;
		case 7:
			pregunta.setPregunta("Pregunta 7");
			pregunta.setOpcionA("opcion7A");
			pregunta.setOpcionB("opcion7B");
			pregunta.setOpcionC("opcion7C");
			pregunta.setOpcionD("opcion7D");
			pregunta.setGood(3);
			break;
		case 8:
			pregunta.setPregunta("Pregunta 8");
			pregunta.setOpcionA("opcion8A");
			pregunta.setOpcionB("opcion8B");
			pregunta.setOpcionC("opcion8C");
			pregunta.setOpcionD("opcion8D");
			pregunta.setGood(4);
			break;
		case 9:
			pregunta.setPregunta("Pregunta 9");
			pregunta.setOpcionA("opcion9A");
			pregunta.setOpcionB("opcion9B");
			pregunta.setOpcionC("opcion9C");
			pregunta.setOpcionD("opcion9D");
			pregunta.setGood(1);
			break;
		case 10:
			pregunta.setPregunta("Pregunta 10");
			pregunta.setOpcionA("opcion10A");
			pregunta.setOpcionB("opcion10B");
			pregunta.setOpcionC("opcion10C");
			pregunta.setOpcionD("opcion10D");
			pregunta.setGood(1);
			break;	
			default:
				break;
		
		}
		return pregunta;
	}
}
