public class Adolescente extends Pessoa {

    public Adolescente(String nome) {
        super(nome);
    }

    @Override
    public void mostrarEventos() {
        System.out.println("=== Adolescência de " + nome + " ===");
        System.out.println("Com 13 anos conquistei o 2º lugar no torneio escolar de tênis de mesa.");
        System.out.println("Com 14 anos me formei no 9º ano e mudei de escola.");
        System.out.println("Com 16 anos perdi meu avô no começo da pandemia.");
        System.out.println("Com 16 anos conheci minha atual namorada.");
        System.out.println("Com 17 anos me formei no ensino médio.");
        System.out.println("Com 17 anos comprei meu primeiro notebook.");
    }
}
