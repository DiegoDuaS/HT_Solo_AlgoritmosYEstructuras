import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.lang.model.util.ElementScanner14;

public class Controller {
    Read read = new Read();
    View vista = new View();
    Boolean con = true;
    Map<Integer, Producto> Productos;
    Map<Integer, Producto> Compras;
    int indice;
    
    public void work(){
        String res = vista.Inicio();;
        Productos = read.read(res);
        Compras = Factory.createMap(res);
        indice = 0;
        
        while(con == true){ 
            String ans = vista.MenuPrincipal();
            if(ans.equals("1")){ 
                Boolean find = false;
                String prod = vista.NomProducto();
                int cant = vista.NumProducto();
                for (Producto producto : Productos.values()) {
                    Producto compra = producto;
                    if(compra.getNombre().equals(prod)){
                        if(IsInCarrito(Compras, prod)){
                            compra.setCantidad(compra.getCantidad() + cant);
                            indice++;
                            find = true;
                        }   
                        else{
                            Producto nuevo = compra;
                            compra.setCantidad(cant);
                            Compras.put(indice, nuevo);
                            indice++;
                            find = true;
                        }
                    }  
                }
                if(find == true){
                    vista.Encontrado();
                }
                else{
                    vista.NoEncontrado();
                }
            }
            else if (ans.equals("2")){ 
                String prod = vista.InfoProd();
                Boolean find = false;
                for (Producto producto : Productos.values()){
                    Producto compra = producto;
                    if(compra.getNombre().equals(prod)){
                        vista.InfoProdEncontrado(compra);
                        find = true;
                    }
                }
                if(find == false){
                    vista.NoEncontrado();
                }
            }
            else if (ans.equals("3")){
                String question = vista.TipodeImpresionProductos();
                if(question.equals("1")){
                    for (Producto producto : Productos.values()){
                        vista.ImprimirProductos(producto);
                    }
                }
                else if (question.equals("2")){
                    vista.ImprimirProductosOrdenados(Productos);
                }
            }
            else if (ans.equals("4")){
                String question = vista.TipodeImpresionCarritos();
                if(question.equals("1")){
                    for (Producto producto : Compras.values()){
                        vista.ImprimirCarrito(producto);
                    }
                }
                else if (question.equals("2")){
                    vista.ImprimirCarritoOrdenado(Compras);
                }
            }
            else if (ans.equals("5")){
                vista.salir();
                con = false;
            }
        }
        
    }

    public boolean IsInCarrito(Map<Integer, Producto> Mapita, String nombre) {
        for (Producto producto : Mapita.values()) {
            if (producto.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

}
