public class Crianca extends Pessoa {

    public Crianca(String nome) {
        super(nome);
    }

    @Override
    public void mostrarEventos() {
        System.out.println("=== Infância de " + nome + " ===");
        System.out.println("Com 5 anos ingressei na escola pela primeira vez.");
        System.out.println("Com 5 anos conheci meu melhor amigo.");
        System.out.println("Com 7 anos ingressei na escolinha de futebol (mas parei logo depois).");
        System.out.println("Com 7 anos passei minhas primeiras férias longe de casa.");
        System.out.println("Com 7 anos fui à praia pela segunda vez (a primeira eu não lembro).");
        System.out.println("Com 11 anos mudei de escola.");
        System.out.println("Com 12 anos conquistei o 1º lugar no torneio de tênis de mesa da escola.");
    }
}
