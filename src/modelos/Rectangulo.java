package modelos;



/**
 * 
 */
public class Rectangulo {

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
        return 0;
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
        return 0;
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
    public void calcularArea(int base, int altura) {
    	int area;
    	area=base*altura;
    	System.out.println(area);       
    }

    /**
     * Metodo que obtiene una base y una altura y calcula su correspondiente perimetro.
     */
    public void calcularPerimetro(int base, int altura) {
    	int perimetro;
    	perimetro=(base*2)+(altura*2);
    	System.out.println(perimetro);
    	
    }

}