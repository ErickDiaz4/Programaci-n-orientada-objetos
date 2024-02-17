package Mascota;

public class tipoMascota {
        String nombre;
        int edad;
        Double cantidadComida;
        String sonido;

        public tipoMascota(String nombre, int edad, Double cantidadComida, String sonido) {

            this.nombre = nombre;
            this.edad = edad;
            this.cantidadComida = cantidadComida;
            this.sonido = sonido;
        }

    @Override
    public String toString() {
        return "tipoMascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cantidadComida=" + cantidadComida +
                ", sonido='" + sonido + '\'' +
                '}';
    }
}
