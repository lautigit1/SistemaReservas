 import java.util.ArrayList;
 public class Reservas {
        private ArrayList<Vuelo> vuelos;

        public Reservas() {
            vuelos = new ArrayList<>();
        }

        public void agregarVuelo(Vuelo vuelo) {
            vuelos.add(vuelo);
        }

        public double calcularPrecioTotal() {
            double total = 0;
            for (Vuelo vuelo : vuelos) {
                total += vuelo.calcularPrecio();
            }
            return total;
        }

        public void aplicarPromociones(double porcentaje) {
            for (Vuelo vuelo : vuelos) {
                if (vuelo instanceof Promocionable) {
                    ((Promocionable) vuelo).aplicarPromocion(porcentaje);
                }
            }
        }

        public void mostrarVuelos() {
            for (Vuelo vuelo : vuelos) {
                System.out.println(vuelo + " - Precio: " + vuelo.calcularPrecio());
            }
        }
    }


