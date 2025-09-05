public class Crianca extends Pessoa {
    public Crianca(String nome, int idade, String hobby) {
        super(nome, idade, hobby);
    }

    @Override
    public void viver() {
        System.out.println("=== INFÂNCIA ===");
    }

    public void estudar() {
        System.out.println("\n - Nascimento 08/03/2004;");
        System.out.println("\n[5 anos]");
        System.out.println(" - Ingressei na escola;");
        System.out.println(" - Passei minhas primeiras férias longe dos meus pais;");
        System.out.println(" - Conheci meu melhor amigo;");

        System.out.println("\n[8-14 anos]");
        System.out.println(" - Mudei de escola;");
        System.out.println(" - Fiz novos amigos;");
        System.out.println(" - Ganhei meu primeiro torneio de tênis de mesa;");
        System.out.println(" - Comecei a ajudar meus pais na lavoura;");
    }
}
