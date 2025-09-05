public class MapaDaVida {
    public static void main(String[] args) {
        // INFÂNCIA
        Pessoa euCrianca = new Crianca("Kauã", 5, "jogar bola");
        euCrianca.viver();
        ((Crianca) euCrianca).estudar();
        System.out.println();

        // ADOLESCÊNCIA
        Pessoa euAdolescente = new Adolescente("Kauã", 15, "jogar videogame");
        euAdolescente.viver();
        ((Adolescente) euAdolescente).estudar();
        System.out.println();

        // ADULTEZ
        Pessoa euAdulto = new Adulto("Kauã", 20, "estudar e passar o tempo com a família");
        euAdulto.viver();
        ((Adulto) euAdulto).trabalhar();

        System.out.println("\nO ciclo da minha vida continua sendo escrito!");
    }
}
