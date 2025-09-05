public class Pessoa {
    private String nome;
    private int idade;
    private String hobby;

    public Pessoa(String nome, int idade, String hobby) {
        this.nome = nome;
        this.idade = idade;
        this.hobby = hobby;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getHobby() { return hobby; }
    public void setHobby(String hobby) { this.hobby = hobby; }

    public void envelhecer(int anos) {
        this.idade += anos;
        System.out.println("Envelheci " + anos + " anos. Agora tenho " + idade + " anos.");
    }

    public void mudarHobby(String novoHobby) {
        System.out.println("Mudei de hobby: antes gostava de " + hobby + ", agora gosto de " + novoHobby + ".");
        this.hobby = novoHobby;
    }

    public void viver() {
        System.out.println("Estou vivendo a vida.");
    }
}
