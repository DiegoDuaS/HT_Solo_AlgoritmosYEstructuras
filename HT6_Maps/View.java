/**
 * @author: Diego Duarte
 * 
 * @since:06/03/2023
 **/
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    
    /** 
     * @return String
     */
    public String Inicio(){
        System.out.println("***SUPERMERCADO MARACUYA*** \n ¿Con cual mapa desea hacer su compra? \n 1. Hashmap \n 2. Tree Map \n 3. Linked Hashmap");
        String res = sc.next();
        return res;
    }

    
    /** 
     * @return String
     */
    public String MenuPrincipal(){
        System.out.println("***SUPERMERCADO MARACUYA*** \n ¿Qué desea hacer? \n 1. Agregar un Producto al Carrito \n 2. Categoria de Producto \n 3. Productos en Inventario \n 4. Productos en Carrito \n 5. Salir");
        String res = sc.next();
        return res;
    }

    
    /** 
     * @return String
     */
    public String NomProducto(){
        System.out.println("Ingrese el nombre del producto que quiere adquirir:");
        String res = sc.next();
        res += sc.nextLine();
        return res;
    }

    
    /** 
     * @return int
     */
    public int NumProducto(){
        System.out.println("Ingrese la cantidad del producto que quiere adquirir:");
        int res = sc.nextInt();
        return res;
    }

    public void NoEncontrado(){
        System.out.println("***\nProducto no encontrado\n***");
    }

    
    /** 
     * @return String
     */
    public String InfoProd(){
        System.out.println("Ingrese el nombre del producto que desea buscar:");
        String res = sc.next();
        res += sc.nextLine();
        return res;
    }

    public void Encontrado(){
        System.out.println("***\nEl producto fue agregado a la lista de compra correctamente\n***");
    }

    
    /** 
     * @param prod
     */
    public void InfoProdEncontrado(Producto prod){
        System.out.println("***\nEl producto " + prod.getNombre() + " se encuentra en " + prod.getTipo() + "\n***");
    }

    
    /** 
     * @return String
     */
    public String TipodeImpresionProductos(){
        System.out.println("¿Cómo quiere imprimir los Productos disponibles?\n 1.Normal \n 2.Ordenado");
        String res = sc.next();
        return res;
    }

    
    /** 
     * @return String
     */
    public String TipodeImpresionCarritos(){
        System.out.println("¿Cómo quiere imprimir los productos en Carritos?\n 1.Normal \n 2.Ordenado");
        String res = sc.next();
        return res;
    }

    
    /** 
     * @param prod
     */
    public void ImprimirProductos(Producto prod){
        System.out.println("\n-----------\nCategoria: " + prod.getTipo() + "\nNombre: " + prod.getNombre() + "\n-----------");
    }

    
    /** 
     * @param prod
     */
    public void ImprimirCarrito(Producto prod){
        System.out.println("\n-----------\nCategoria: " + prod.getTipo() + "\nNombre: " + prod.getNombre() + "\nCantidad: " + prod.getCantidad() + "\n-----------");
    }

    
    /** 
     * @param mapa
     */
    public void ImprimirProductosOrdenados(Map<Integer, Producto> mapa){
        System.out.println("---Mueble de Terraza---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Mueble de terraza")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
        System.out.println("---Sillones de Masaje---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Sillones de masaje")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
        System.out.println("---Bebidas---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Bebidas")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
        System.out.println("---Condimentos---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Condimentos")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
        System.out.println("---Frutas---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Frutas")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
        System.out.println("---Carnes---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Carnes")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
        System.out.println("---Lácteos---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Lácteos")){ 
                System.out.println("Nombre: " + producto.getNombre());
            }
        }
    }

    
    /** 
     * @param mapa
     */
    public void ImprimirCarritoOrdenado(Map<Integer, Producto> mapa){
        System.out.println("---Mueble de Terraza---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Mueble de terraza")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
        System.out.println("---Sillones de Masaje---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Sillones de masaje")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
        System.out.println("---Bebidas---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Bebidas")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
        System.out.println("---Condimentos---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Condimentos")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
        System.out.println("---Frutas---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Frutas")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
        System.out.println("---Carnes---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Carnes")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
        System.out.println("---Lácteos---");
        for (Producto producto : mapa.values()){
            if(producto.getTipo().equals("Lácteos")){ 
                System.out.println("Nombre: " + producto.getNombre() + " || Cantidad: " + producto.getCantidad());
            }
        }
    }

    public void salir(){
        System.out.println("---------------------------------------------------- \n *** SUPERMERCADO MARACUYA AGRADECE SU COMPRA :) *** \n ----------------------------------------------------");
    }                             



}
