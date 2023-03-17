public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(5, 10);
        figuras[2] = new Triangulo(5, 10);
        figuras[3] = new Triangulo(5, 10);
        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras.length; j++) {
                    figuras[i].compareTo(figuras[i], figuras[j]);
                }
            }
        }
    }
