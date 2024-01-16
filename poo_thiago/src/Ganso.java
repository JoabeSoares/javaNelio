public class Ganso {
    public String cor;
    public String altura;

    public Ganso(String cor, String altura) {
        this.cor = cor;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Ganso{" +
                "cor='" + cor + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }
}
