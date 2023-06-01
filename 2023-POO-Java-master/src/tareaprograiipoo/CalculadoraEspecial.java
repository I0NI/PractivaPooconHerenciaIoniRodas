package tareaprograiipoo;

public class CalculadoraEspecial extends Calculadora {

    
    public CalculadoraEspecial(String ioni){
        super(ioni);
        this.tipoCalculadora = "Calculadora Especial";
    }
    
    
    public double redondear(double numero) {
        return Math.round(numero);
    }
    
    public double seno(double numero) {
        return Math.sin(Math.toRadians(numero));
    }

    public double valorAleatorio() {
        return Math.random();
    }

    public double tangente(double numero) {
        return Math.tan(Math.toRadians(numero));
    }
    
    public int Factorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double coseno(double numero) {
        return Math.cos(Math.toRadians(numero));
    }
}

