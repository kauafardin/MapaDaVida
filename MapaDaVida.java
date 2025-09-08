public class MapaDaVida {
    public static void main(String[] args) {
        String nome = "Kauã";

        Pessoa[] fases = {
            new Crianca(nome),
            new Adolescente(nome),
            new Adulto(nome)
        };

        for (Pessoa p : fases) {
            p.mostrarEventos();
            System.out.println();
        }
    }
}
