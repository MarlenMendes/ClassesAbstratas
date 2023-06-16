abstract class Forma {
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}
class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }
    public float getAltura() {
        return altura;
    }
    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }
}
class Circulo extends Forma {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }
    public float getRaio() {
        return raio;
    }
    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }
}
class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado, lado);

    }
}
 public class ClasseDois {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];

        formas[0] = new Retangulo(4, 5);
        formas[1] = new Circulo(3);
        formas[2] = new Quadrado(6);
        formas[3] = new Circulo(2.5f);
        formas[4] = new Retangulo(7, 2);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println();

        }
    }
}