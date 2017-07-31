
package br.edu.ifsul.controle;

import br.edu.ifsul.dao.ConsultaDAO;
import br.edu.ifsul.dao.ExameDAO;
import br.edu.ifsul.dao.MedicoDAO;
import br.edu.ifsul.dao.PacienteDAO;
import br.edu.ifsul.modelo.Consulta;
import br.edu.ifsul.modelo.Exame;
import br.edu.ifsul.modelo.Medico;
import br.edu.ifsul.modelo.Paciente;
import br.edu.ifsul.util.Util;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Crisley Alves
 * @email crisleyalvesphx@gmail.com
 * @organization IFSUL - Campus Passo Fundo
 */
@ManagedBean(name = "controleConsulta")
@ViewScoped
public class ControleConsulta implements Serializable {

    private ConsultaDAO<Consulta> dao;
    private Consulta objeto;
    
    private MedicoDAO<Medico> daoMedico;
    private PacienteDAO<Paciente> daoPaciente;
    
    private Boolean novoDado;
    private Exame exame;
    private ExameDAO<Exame> daoExame;
    
    public ControleConsulta(){
        dao = new ConsultaDAO<>();
        daoMedico = new  MedicoDAO<>();
        daoPaciente = new PacienteDAO<>();
        daoExame = new ExameDAO<>();
    }
    
    public void adicionarExame(){
        if(getExame() != null){
                getExame().setConsulta(getObjeto());
                getObjeto().getListaExames().add(getExame());
                Util.mensagemInformacao("Exame adicionado com sucesso");
        }else{
            System.out.println("Caiu aqui");
        }
    }
    
     public void novaExame(){
        setExame(new Exame());
        System.out.println("novo exame instanciado");
        setNovoDado((Boolean) true);
    }
    
    public void alterarExame(int index){
        setExame(getObjeto().getListaExames().get(index));
        getObjeto().removerExame(index);
        setNovoDado((Boolean) false);
    }
    
    public void removerExame(int index){
        getObjeto().getListaExames().remove(index);
        Util.mensagemInformacao("O exame foi removido com sucesso");
    }
    
    public String listar(){
        return "/privado/consulta/listar?faces-redirect=true";
    }
    
    public void novo(){
        setObjeto(new Consulta());
    }
    
    public void salvar(){
        boolean persistiu;
        if (getObjeto().getId() == null){
            persistiu = getDao().persist(getObjeto());
        } else {
            persistiu = getDao().merge(getObjeto());
        }
        if (persistiu){
            Util.mensagemInformacao(getDao().getMensagem());
        } else {
            Util.mensagemErro(getDao().getMensagem());
        }
    }
    
    public void editar(Integer id){
        setObjeto(getDao().localizar(id));
    }
    
    public void remover(Integer id){
        setObjeto(getDao().localizar(id));
        if (getDao().remover(getObjeto())){
            Util.mensagemInformacao(getDao().getMensagem());
        } else {
            Util.mensagemErro(getDao().getMensagem());
        }
    }

    public ConsultaDAO<Consulta> getDao() {
        return dao;
    }

    public void setDao(ConsultaDAO<Consulta> dao) {
        this.dao = dao;
    }

    public Consulta getObjeto() {
        return objeto;
    }

    public void setObjeto(Consulta objeto) {
        this.objeto = objeto;
    }

    public MedicoDAO<Medico> getDaoMedico() {
        return daoMedico;
    }

    public void setDaoMedico(MedicoDAO<Medico> daoMedico) {
        this.daoMedico = daoMedico;
    }

    public PacienteDAO<Paciente> getDaoPaciente() {
        return daoPaciente;
    }

    public void setDaoPaciente(PacienteDAO<Paciente> daoPaciente) {
        this.daoPaciente = daoPaciente;
    }

    public Boolean getNovoDado() {
        return novoDado;
    }

    public void setNovoDado(Boolean novoDado) {
        this.novoDado = novoDado;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public ExameDAO<Exame> getDaoExame() {
        return daoExame;
    }

    public void setDaoExame(ExameDAO<Exame> daoExame) {
        this.daoExame = daoExame;
    }
    
    
    
    
}
