public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }


    public int numeroLados() {
        return 1;
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

