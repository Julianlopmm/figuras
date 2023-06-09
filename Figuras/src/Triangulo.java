public class Triangulo extends Figura {

        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return (base * altura) / 2;
        }

        public int numeroLados() {
        return 3;
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
