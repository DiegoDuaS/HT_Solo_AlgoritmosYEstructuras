/**
 * @author: Diego Duarte
 * 
 * @since:06/03/2023
 **/
 
public class Producto {
    String tipo;
    String nombre;
    int cantidad = 0;

    public Producto(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getTipo() {
        return tipo;
    }
    
    /** 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** 
     * @return int
     */
    public int getCantidad(){
        return cantidad;
    }
    
    /** 
     * @param cantidad
     */
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    
}
