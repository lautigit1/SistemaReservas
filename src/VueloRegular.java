public class VueloRegular extends Vuelo implements Promocionable {
        private int numeroAsientos;
        private double precioBase;

        public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBase) {
            super(numeroVuelo, origen, destino, fecha);
            this.numeroAsientos = numeroAsientos;
            this.precioBase = precioBase;
        }

        @Override
        public double calcularPrecio() {
            return numeroAsientos * precioBase;
        }

        @Override
        public void aplicarPromocion(double porcentaje) {
            precioBase -= precioBase * (porcentaje / 100);
        }
    }


