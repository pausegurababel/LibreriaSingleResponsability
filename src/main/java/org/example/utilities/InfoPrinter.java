package org.example.utilities;

import org.example.models.Material;

public class InfoPrinter {

    public InfoPrinter(){
    }

    public void print(Material material){
        System.out.println("Titulo: " + material.getTitulo() + ", Autor/Autora: " + material.getAutor() + ", Stock: " + material.getStock());

    }
}
