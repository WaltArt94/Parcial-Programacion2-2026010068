public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Walter Vasquez", 1000);
        System.out.println("Usando comision estandar por defecto");
        v.mostrarDetalle();
    }
}