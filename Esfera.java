package clases;
/** 
 * hecho por Neos Rafael Ruiz Sanchez
 * La clase Esfera es una esfera geométrica.
 * 
 * Tiene un atributo radio que representa el radio.
 * 
 * La clase cuenta con dos constructores uno por defecto y otro que permite
 * especificar el radio.
 */
public class Esfera {
	
	/** El radio de la esfera. Por defecto es 1.0 */
	double radio = 1.0;
	
	/**
	 * Constructor por defecto de la clase Esfera.
	 */
	public Esfera() {
		super();
	}

	/**
	 * la clase Esfera que permite especificar el radio de la esfera.
	 * 
	 * @param radio El radio de la esfera.
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Calcula la superficie de la esfera.
	 * La fórmula utilizada es: superficie = 4 * pi * radio^2.
	 * 
	 * @return La superficie de la esfera.
	 */
	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	
	/**
	 * Calcula y retorna el volumen de la esfera.
	 * La fórmula utilizada es: volumen = (4/3) * pi * radio^3.
	 * 
	 * @return El volumen de la esfera.
	 */
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
        }
}