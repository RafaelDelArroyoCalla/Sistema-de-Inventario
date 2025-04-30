package model;
import exception.DatoInvalidoException;

public class Categoria {
    private String codigoCategoria;
    private String nombre;
    private String descripcion;

    public Categoria(String codigoCategoria, String nombre, String descripcion) {
        if (codigoCategoria == null || codigoCategoria.isEmpty()) {
            throw new DatoInvalidoException("El código de la categoría no puede estar vacío.");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new DatoInvalidoException("El nombre de la categoría no puede estar vacío.");
        }


        this.codigoCategoria = codigoCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Código: " + codigoCategoria + " | Nombre: " + nombre + " | Descripción: " + descripcion;
    }
}
