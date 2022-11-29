public class Medico {
    private String nome;
    private boolean autorizado;

    public Medico(String nome, boolean autorizado) {
        this.nome = nome;
        this.autorizado = autorizado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}
