public class Adolescente extends Pessoa {
    public Adolescente(String nome, int idade, String hobby) {
        super(nome, idade, hobby);
    }

    @Override
    public void viver() {
        System.out.println("=== ADOLESCÊNCIA ===");
    }

    public void estudar() {
        System.out.println("\n[15-16 anos]");
        System.out.println(" - Mudei de escola novamente;");
        System.out.println(" - Comecei a estudar no turno da noite;");
        System.out.println(" - Comecei a fazer aulas de violão e logo parei;");

        System.out.println("\n[17-18 anos]");
        System.out.println(" - Competi com a escola em outro torneio de tênis de mesa e ganhei 2º lugar;");
        System.out.println(" - Continuei estudando e praticando esportes;");
    }
}
