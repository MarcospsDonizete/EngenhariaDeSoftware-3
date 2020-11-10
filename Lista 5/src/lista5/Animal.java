package lista5;

public abstract class  Animal {
    public String nome;
    public Peso peso;
    public String dataDeNascimento;
    public String raca;
    public String id;
    public String genero;
    public CartaoVacinas cartao;

    public Animal() {
        this.cartao=new CartaoVacinas (this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
               "Peso: " + this.peso.toString() + "\n" +
               "Data de Nascimento: "+ this.dataDeNascimento + "\n" +
               "Raça: " + this.raca + "\n" + 
               "ID: " + this.id + "\n" +
               "Genêro: " + this.genero + "\n" +
               "Cartão de Vacinas: "+ "\n" + this.cartao.imprimeVacinas();
    }



}