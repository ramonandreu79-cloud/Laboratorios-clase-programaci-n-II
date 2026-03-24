public class Vaso {
    int capacidad;
    int contenido;

    public Vaso(int capacidad) {
        this.capacidad = capacidad;
    }

    public void llenar(int cantidad) {
        if (this.contenido + cantidad > this.capacidad) {
            throw new RuntimeException("Capacidad superada");
        }

        else {
        this.contenido = this.contenido + cantidad;
        }
    }

    public void vaciar(int cantidad) {
        if(this.contenido - cantidad < 0) {
            throw new RuntimeException("No hay suficiente cantidad para vaciar");
                }
        else {
            this.contenido = this.contenido - cantidad;
        }
    }

    public int capacidad() {
        return this.capacidad;
    }

    public int contenido() {
        return this.contenido;
    }

    public String toString() {
        int nivel = 5 * contenido / capacidad;
        String resultado = String.format("|      | %dml\n", capacidad);
        
        for (int i = 4; nivel < i; i--) {
            resultado += "|      |\n";
        }
        
        if (contenido > 0) {
            resultado += String.format("|------| %dml\n", contenido);
        } else {
            resultado += "|      |\n";
        }
        
        for (int i = nivel - 1; i > 0; i--) {
            resultado += "|      |\n";
        }
        
        resultado += "|______| 0ml\n";
        return resultado;
    }
}