package modelos;


/**
 * 
 */
public class Circulo extends Figura {

	/**
     * Constructor predeterminado que establece radio en 1
     */
    public Circulo() {
    	radio=1;
    }

    /**
     * 
     */
    public int radio;

  
    /**
     * @param int radio	Constructor que establece el valor del radio al indicado
     */
    public  Circulo( int radio) {
        this.radio=radio;
    }

    /**
     * @return
     */
    public int getRadio() {
        // TODO implement here
        return radio;
    }

    /**
     * @param int radio
     */
    public void setRadio(int radio) {
        this.radio=radio;
    }

    /**
     * @return
     */
    
    public String toString() {
        // TODO implement here
        return "El radio del circulo es: "+radio+" cm";
    }

    /**
     *Metodo que calcula el area del circulo
     */
    public int calcularArea() {
        double pi=3.14;
        int area;
        area=(int)pi*radio;
        return area;
    }

    /**
     *Metodo que calcula el perimetro del circulo
     */
    public int calcularPerimetro() {
    	double pi=3.14;
        int perimetro;
        perimetro=(int)(pi*2)*radio;
        return perimetro;
    }

}