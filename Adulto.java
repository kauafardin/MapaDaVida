public class Adulto extends Pessoa {
    public Adulto(String nome, int idade, String hobby) {
        super(nome, idade, hobby);
    }

    @Override
    public void viver() {
        System.out.println("=== ADULTO ===");
    }

    public void trabalhar() {
        System.out.println("\n[18 anos – presente]");
        System.out.println(" - Ingressei na faculdade;");
        System.out.println(" - Me mudei para o Recanto;");
        System.out.println(" - Tive meu primeiro emprego fora de casa, no projeto Cultivando;");
        System.out.println(" - Retornei para minha cidade;");
        System.out.println(" - Conheci minha namorada;");
        System.out.println(" - Perdi meus avós;");
        System.out.println(" - Tirei minha habilitação e comprei minha primeira moto;");
    }
}
