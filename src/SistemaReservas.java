public class SistemaReservas {
        public static void main(String[] args) {
            Reservas reservas = new Reservas();

            // Crear vuelos
            VueloRegular vuelo1 = new VueloRegular("VR123", "Madrid", "París", "2024-11-20", 150, 120.5);
            VueloCharter vuelo2 = new VueloCharter("VC456", "Londres", "Nueva York", "2024-11-25", 15000);

            // Agregar vuelos
            reservas.agregarVuelo(vuelo1);
            reservas.agregarVuelo(vuelo2);

            // Mostrar información de los vuelos
            System.out.println("Vuelos antes de aplicar promociones:");
            reservas.mostrarVuelos();

            // Aplicar promociones
            reservas.aplicarPromociones(10);

            System.out.println("\nVuelos después de aplicar promociones:");
            reservas.mostrarVuelos();

            // Calcular precio total
            System.out.println("\nPrecio total de las reservas: " + reservas.calcularPrecioTotal());
        }
    }


