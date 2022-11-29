import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Paciente> pacientes = new HashMap<>();

    public static Paciente getPaciente(Integer numero){
        return pacientes.get(numero);
    }

    public static void adicionaPaciente(Paciente paciente){
        pacientes.put(paciente.getNumero(), paciente);
    }

}
