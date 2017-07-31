package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Medico;
import java.io.Serializable;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
public class MedicoDAO<T> extends DAOGenerico<Medico> implements Serializable{
 
    public MedicoDAO(){
        super();
        super.setClassePersistente(Medico.class);
    }
    
    
}
