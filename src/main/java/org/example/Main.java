package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //manza
        String nombre="Manzana";
        Integer precio=5000;
        String descripcion="Deliciosa manzana importada";
        Integer codigo=4587986;

        //ARREGLO PRIMITIVO
        String[] frutas= new String[500];

        //ARREGLO EVOLUCIONADO DINAMICOS (LISTA)
        ArrayList<String> frutasDos= new ArrayList<  >();
        frutasDos.add("Manzana");
        frutasDos.add("Pera");
        frutasDos.add("Sandia");
        System.out.println(frutasDos);

        //Arreglo o lista de nombrees de clientes (5)--> String
        //Arreglo olista de proveedores (10)--> String
        // Arreglo o lista de valores de servicios publicos (5 meses) Integer/Double

        ArrayList<String> clientes= new ArrayList<>();
        clientes.add("Fannerys");
        clientes.add("Steven");
        clientes.add("Mafe");
        clientes.add("Adriana");
        clientes.add("Cristian");
        System.out.println(clientes);


        ArrayList<String> proveedores=  new ArrayList<>();
        proveedores.add("Sura");
        proveedores.add("Éxito");
        proveedores.add("Alkosto");
        proveedores.add("Jumbo");
        proveedores.add("D1");
        proveedores.add("Ara");
        proveedores.add("Homecenter");
        proveedores.add("Falabella");
        proveedores.add("Mercado Libre");
        proveedores.add("Amazon");
        System.out.println(proveedores);

        ArrayList<Double> servicios = new ArrayList<>();
        servicios.add(150000.50); // Mes 1
        servicios.add(160200.00); // Mes 2
        servicios.add(145000.75); // Mes 3
        servicios.add(170000.00); // Mes 4
        servicios.add(155500.25); // Mes 5
        System.out.println("Servicios Publicos (5 meses): " + servicios);




    }


}