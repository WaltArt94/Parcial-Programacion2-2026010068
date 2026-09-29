public class ComisionPersonalizada implements EstrategiaComision {
    private static final int N = 6; // letras de mi nombre "Walter"

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * (5 + N) / 100.0; //N = 6 la cantidad  de letras de WALTER
    }
}