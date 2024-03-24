package modelos;



/**
 * 
 */
public class Rectangulo extends Figura {

    /**
     * Constructor por defecto que establece tanto la altura como la base a 1
     */
    public Rectangulo() {
    	altura=1;
        base=1;
    }
   /**
    * Constructor que te permitirá establecer la base y la altura con los valores indicados
    * 
    * @param base 	La base del Rectangulo
    * @param altura	La altura del Rectangulo
    */
    public Rectangulo( int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    /**
     * 
     */
    public int base;

    /**
     * 
     */
    public int altura;



    /**
     * @return
     */
    public int getBase() {
        // TODO implement here
        return base;
    }

    /**
     * @param int base
     */
    public void setBase(int base) {
        this.base=base;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return altura;
    }

    /**
     * @param int altura
     * @return 
     */
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * @return
     */
   
    public String toString() {
        // TODO implement here
        return "La base es de:" +base+ "cm y la altura es de: "+altura;
    }

    /**
     * Metodo que obtiene una base y una altura y calcula su correspondiente area.
     */
    public int calcularArea() {
    	int area;
    	area=base*altura;
    	return area;       
    }

    /**
     * Metodo que obtiene una base y una altura y calcula su correspondiente perimetro.
     */
    public int calcularPerimetro() {
    	int perimetro;
    	perimetro=(base*2)+(altura*2);
    	return perimetro;
    	
    }
	

}