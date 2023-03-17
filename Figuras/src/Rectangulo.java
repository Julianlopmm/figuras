public class Rectangulo extends Figura implements Comparable<Figura>{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return base * altura;
    }

    public int numeroLados() {
        return 4;
    }


    public int compareTo(Figura aComparar) {
        if (this.calcularArea() > aComparar.calcularArea()) {
            return 1;
        } else if (this.calcularArea() < aComparar.calcularArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
