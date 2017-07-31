package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Consulta;
import java.io.Serializable;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
public class ConsultaDAO<T> extends DAOGenerico<Consulta> implements Serializable{
 
    public ConsultaDAO(){
        super();
        super.setClassePersistente(Consulta.class);
    }
    
    
}
