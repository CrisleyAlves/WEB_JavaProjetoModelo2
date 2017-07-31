package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Paciente;
import java.io.Serializable;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
public class PacienteDAO<T> extends DAOGenerico<Paciente> implements Serializable{
 
    public PacienteDAO(){
        super();
        super.setClassePersistente(Paciente.class);
    }
    
    
}
