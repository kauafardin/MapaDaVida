public class Adulto extends Pessoa {

    public Adulto(String nome) {
        super(nome);
    }

    @Override
    public void mostrarEventos() {
        System.out.println("=== Vida Adulta de " + nome + " ===");
        System.out.println("Com 18 anos ingressei na faculdade de Sistemas de Informação.");
        System.out.println("Com 18 anos comecei a namorar (meu relacionamento atual).");
        System.out.println("Com 18 anos mudei para o Recanto.");
        System.out.println("Com 18 anos tive meu primeiro emprego fora de casa: projeto 'Cultivando'.");
        System.out.println("Com 18 anos, após cerca de 6 meses, retornei para a cidade natal.");
        System.out.println("Com 18 anos perdi minha avó (logo após o retorno).");
        System.out.println("Com 19 anos tirei minha habilitação.");
        System.out.println("Com 20 anos comprei minha moto.");
        System.out.println("Com 20 anos comecei a trabalhar no meu emprego atual (Meta).");
    }
}
