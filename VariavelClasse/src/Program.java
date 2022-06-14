public class Program {

    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();

        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor + " Quadrado.cor: " + Quadrado.cor);

        q1.cor = "Verde";

        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor + " Quadrado.cor: " + Quadrado.cor);

        q2.cor = "Amarelo";

        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor + " Quadrado.cor: " + Quadrado.cor);

        Quadrado.cor = "Vermelho";

        System.out.println("q1.cor: " + q1.cor + " q2.cor: " + q2.cor + " Quadrado.cor: " + Quadrado.cor);

    }

}
