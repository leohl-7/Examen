public class Ejercicioexamen {
    public static void main(String[] args) {
        double precioPedido1 = 12.5;
        int unidadesPedido1 = 4;
        double totalPedido1 = SumaPedido(precioPedido1, unidadesPedido1);
        double descuentoPedido1 = Calculardescuento(totalPedido1);
        double precioFinalPedido1 = Preciofinal(totalPedido1, descuentoPedido1);
        System.out.println("Pedido 1: " + precioFinalPedido1 + " euros");

        double precioPedido2 = 8.0;
        int unidadesPedido2 = 5;
        double totalPedido2 = SumaPedido(precioPedido2, unidadesPedido2);
        double descuentoPedido2 = Calculardescuento(totalPedido2);
        double precioFinalPedido2 = Preciofinal(totalPedido2, descuentoPedido2);
        System.out.println("Pedido 2: " + precioFinalPedido2 + " euros");
        double importeTotal = precioFinalPedido1 + precioFinalPedido2;

        double importePlazo = importeTotal / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + importePlazo + " euros");

        double mediaUnidades = (unidadesPedido1 + unidadesPedido2) / 2.0;
        System.out.println("Media de unidades por pedido: " + mediaUnidades);
    }

    private static double Preciofinal(double totalPedido, double descuentoPedido) {
        double precioFinalPedido = totalPedido - descuentoPedido;
        return precioFinalPedido;
    }

    private static double SumaPedido(double precioPedido, int unidadesPedido) {
        double totalPedido = precioPedido * unidadesPedido;
        return totalPedido;
    }

    private static double Calculardescuento(double totalPedido) {
        double descuentoPedido = totalPedido * 10 / 100;
        return descuentoPedido;
    }
}
