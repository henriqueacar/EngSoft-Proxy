import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PacienteProxyTest {

    @BeforeEach
    void setUp(){
        BD.adicionaPaciente(new Paciente("João", "25", "Diabetes", 1));
        BD.adicionaPaciente(new Paciente("Ana", "14", "Dengue", 2));
        BD.adicionaPaciente(new Paciente("Laura", "56", "Gripe", 3));
    }

    @Test
    void deveRetornarDadosPessoais(){
        PacienteProxy proxy = new PacienteProxy(1);

        assertEquals(Arrays.asList("João", "25"), proxy.getDados());
    }

    @Test
    void deveRetornarDiagnostico(){
        Medico medico = new Medico("Tiago", true);
        PacienteProxy proxy = new PacienteProxy(2);

        assertEquals("Dengue", proxy.getDiagnostico(medico));
    }

    @Test
    void deveRetornarExcecaoMedicoNaoAutorizado(){
        try {
            Medico medico = new Medico("Tiago", false);
            PacienteProxy proxy = new PacienteProxy(3);
            proxy.getDiagnostico(medico);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Médico não autorizado.", e.getMessage());
        }


    }


}