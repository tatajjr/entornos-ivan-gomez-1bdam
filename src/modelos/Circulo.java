package modelos;


/**
 * 
 */
public class Circulo {

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
        return 0;
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
    public void calcularArea(int radio) {
        double pi=3.14;
        double area;
        area=pi*radio;
        System.out.println(area);
    }

    /**
     *Metodo que calcula el perimetro del circulo
     */
    public void calcularPerimetro(int radio) {
    	double pi=3.14;
        double perimetro;
        perimetro=(pi*2)*radio;
        System.out.println(perimetro);
    }

}