public abstract class Figura {

    public abstract double calcularArea();
    public abstract int numeroLados();

    public void compareTo(Figura uno, Figura aComparar) {
        if (uno.calcularArea() > aComparar.calcularArea()) {
            System.out.println("El area de la figura uno es mayor");
        } else if (uno.calcularArea() < aComparar.calcularArea()) {
            System.out.println("El area de la figura dos es mayor");

        } else {
            if (uno.calcularArea() == aComparar.calcularArea()) {
                System.out.println("Las areas son iguales");
                if (uno.numeroLados() > aComparar.numeroLados()) {
                    System.out.println("La figura uno tiene mas lados");
                } else if (uno.numeroLados() < aComparar.numeroLados()) {
                    System.out.println("La figura dos tiene mas lados");
                } else {
                    System.out.println("Las figuras tienen la misma cantidad de lados");
                }
            }
        }


    }
}
