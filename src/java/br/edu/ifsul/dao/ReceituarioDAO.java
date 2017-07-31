package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Receituario;
import java.io.Serializable;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
public class ReceituarioDAO<T> extends DAOGenerico<Receituario> implements Serializable{
 
    public ReceituarioDAO(){
        super();
        super.setClassePersistente(Receituario.class);
    }
    
    
}
