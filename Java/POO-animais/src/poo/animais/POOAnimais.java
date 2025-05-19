// Classe base (superclasse)
class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Encapsulamento com getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}

// Subclasse Gato
class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }
}

// Classe principal
public class POOAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mimi", 3);

        cachorro.emitirSom(); // Rex diz: Au Au!
        gato.emitirSom();     // Mimi diz: Miau!

        // Usando encapsulamento para alterar nome
        gato.setNome("Luna");
        System.out.println("Novo nome do gato: " + gato.getNome());
    }
}