import java.util.Arrays;
import java.util.List;

public class Paciente implements IPaciente{

    private String nome,
                   idade,
                   diagnostico;
    private Integer numero;

    public Paciente(Integer numero){
        Paciente paciente = BD.getPaciente(numero);
        this.numero = numero;
        this.nome = paciente.nome;
        this.idade = paciente.idade;
        this.diagnostico = paciente.diagnostico;
    }

    public Paciente(String nome, String idade, String diagnostico, Integer numero) {
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
        this.numero = numero;
    }

    public List<String> getDados(){
        return Arrays.asList(this.nome, this.idade);
    }

    public String getDiagnostico(Medico medico){
        return this.diagnostico;
    }

    public Integer getNumero() {
        return numero;
    }
}
