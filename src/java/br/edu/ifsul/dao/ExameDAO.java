package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Exame;
import java.io.Serializable;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
public class ExameDAO<T> extends DAOGenerico<Exame> implements Serializable{
 
    public ExameDAO(){
        super();
        super.setClassePersistente(Exame.class);
    }
    
    
}
