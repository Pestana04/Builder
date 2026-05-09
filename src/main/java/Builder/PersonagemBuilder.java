package Builder;

public class PersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        personagem = new Personagem();
    }

    public Personagem build() {
        if (personagem.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (personagem.getRaca().equals("")) {
            throw new IllegalArgumentException("Raça inválida");
        }
        if (personagem.getClasse().equals("")) {
            throw new IllegalArgumentException("Classe inválida");
        }
        if (personagem.getNivel() <= 0) {
            throw new IllegalArgumentException("Nível inválido");
        }

        return personagem;
    }

    public PersonagemBuilder setNome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder setRaca(String raca) {
        personagem.setRaca(raca);
        return this;
    }

    public PersonagemBuilder setClasse(String classe) {
        personagem.setClasse(classe);
        return this;
    }

    public PersonagemBuilder setNivel(int nivel) {
        personagem.setNivel(nivel);
        return this;
    }

    public PersonagemBuilder setForca(int forca) {
        personagem.setForca(forca);
        return this;
    }

    public PersonagemBuilder setDestreza(int destreza) {
        personagem.setDestreza(destreza);
        return this;
    }

    public PersonagemBuilder setConstituicao(int constituicao) {
        personagem.setConstituicao(constituicao);
        return this;
    }

    public PersonagemBuilder setInteligencia(int inteligencia) {
        personagem.setInteligencia(inteligencia);
        return this;
    }

    public PersonagemBuilder setSabedoria(int sabedoria) {
        personagem.setSabedoria(sabedoria);
        return this;
    }

    public PersonagemBuilder setCarisma(int carisma) {
        personagem.setCarisma(carisma);
        return this;
    }

    public PersonagemBuilder setArma(String arma) {
        personagem.setArma(arma);
        return this;
    }

    public PersonagemBuilder setArmadura(String armadura) {
        personagem.setArmadura(armadura);
        return this;
    }

    public PersonagemBuilder setMagia(String magia) {
        personagem.setMagia(magia);
        return this;
    }

    public PersonagemBuilder setAlinhamento(String alinhamento) {
        personagem.setAlinhamento(alinhamento);
        return this;
    }

    public PersonagemBuilder setHistoria(String historia) {
        personagem.setHistoria(historia);
        return this;
    }
}