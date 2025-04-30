package model;
import exception.DatoInvalidoException;

public class Articulo {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private Categoria categoria;

    public Articulo(String codigo, String nombre, int cantidad, double precio, Categoria categoria) {
        if (cantidad < 0) {
            throw new DatoInvalidoException("La cantidad debe ser un número entero positivo.");
        }
        if (precio < 0) {
            throw new DatoInvalidoException("El precio no puede ser negativo.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nombre: " + nombre + " | Cantidad: " + cantidad +
                " | Precio: S/" + precio + " | Categoría: " + categoria.getNombre();
    }
}
