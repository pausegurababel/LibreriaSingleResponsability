package org.example.models;

public abstract class Material {

    protected String titulo;
    protected String autor;
    protected int stock;

    public Material(String titulo, String autor, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Stock aumentado en " + cantidad + ". Stock actual: " + this.stock);
        } else {
            System.out.println("La cantidad a aumentar debe ser positiva.");
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad > 0) {
            if (this.stock >= cantidad) {
                this.stock -= cantidad;
                System.out.println("Stock reducido en " + cantidad + ". Stock actual: " + this.stock);
            } else {
                System.out.println("No hay suficiente stock para reducir en " + cantidad + ".");
            }
        } else {
            System.out.println("La cantidad a reducir debe ser positiva.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getStock() {
        return stock;
    }
}
