package Ex04;

public class Triangulo {
    double a, b, c; 
    double x, y;    

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularArea() { 
        double p = (a + b + c) / 2; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
    }

    public double calcularPerimetro() {
        return a + b + c;
    }

    public void calcularCentroide() {
        double lambda = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        if (lambda < -1 || lambda > 1) {
            System.out.println("Erro: valores inválidos para calcular o centróide.");
            return;
        }
        x = (b + a * lambda) / 3;
        y = (a / 3) * Math.sqrt(1 - Math.pow(lambda, 2));
    }
}