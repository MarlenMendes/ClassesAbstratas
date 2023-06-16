import java.util.Scanner;

interface Lampada {
    void ligar();
    void desligar();
}
class Incandescente implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada incandescente ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada incandescente desligada.");
    }
}
class Fluorescente implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada fluorescente ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada fluorescente desligada.");
    }
}

class FabricaLampada {
    public Lampada construir(String tipo) {
        if (tipo.equalsIgnoreCase("incandescente")) {
            return new Incandescente();
        } else if (tipo.equalsIgnoreCase("fluorescente")) {
            return new Fluorescente();
        } else {
            throw new IllegalArgumentException("Tipo de lâmpada inválido.");
    }


    }


    }

 public class Exercicio01 {
    public static void main(String[] args) {




        FabricaLampada fabrica = new FabricaLampada();

// Solicita ao usuário o tipo de lâmpada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tipo de lâmpada você deseja construir? (incandescente/fluorescente)");
        String tipo = scanner.nextLine();

        // Constrói a lâmpada solicitada
        Lampada lampada = fabrica.construir(tipo);

        // Liga e desliga a lâmpada
        lampada.ligar();
        lampada.desligar();

        scanner.close();
    }
}