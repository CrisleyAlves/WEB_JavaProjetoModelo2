package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Especialidade;
import java.io.Serializable;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
public class EspecialidadeDAO<T> extends DAOGenerico<Especialidade> implements Serializable{
 
    public EspecialidadeDAO(){
        super();
        super.setClassePersistente(Especialidade.class);
    }
    
    
}
