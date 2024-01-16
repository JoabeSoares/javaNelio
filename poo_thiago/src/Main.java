import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ganso ganso1 = new Ganso("preto", "10");
        System.out.println(ganso1);

        Livro livro1 = new Livro("Show", "Jow", "2024");
        System.out.println(livro1);

        String titulo = livro1.getTitulo();
        System.out.println("Título do livro: " + titulo);
        String autor = livro1.getAutor();
        System.out.println("Autor do livro: " + autor);
        String anoPublicacao = livro1.getAnoPublicacao();
        System.out.println("Ano de publicação do livro: " + anoPublicacao);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Circulo.calcularArea(raio);
        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        double numero2 = scanner.nextDouble();
        scanner.close();
        double soma = Calculadora.calcularSoma(numero1, numero2);
        System.out.println("A soma de " + numero1 + " com " + numero2 + " é: " + soma);

    }
}