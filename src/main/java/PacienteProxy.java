import java.util.List;

public class PacienteProxy implements IPaciente{
    private Paciente paciente;

    private Integer numero;

    public PacienteProxy(Integer numero){
        this.numero = numero;
    }

    public List<String> getDados(){
        if(this.paciente == null)
            this.paciente = new Paciente(numero);
        return this.paciente.getDados();
    }

    public String getDiagnostico(Medico medico){
        if(this.paciente == null){
            this.paciente = new Paciente(this.numero);
        }
        if(medico.isAutorizado()){
            return this.paciente.getDiagnostico(medico);
        }
        else {
            throw new IllegalArgumentException("Médico não autorizado.");
        }
    }
}
