package br.com.esig;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.DaoGeneric;
import br.com.entidades.Tarefa;

@ViewScoped
@ManagedBean(name = "tarefaBean")
public class TarefaBean {

	private Tarefa tarefa = new Tarefa();
	private DaoGeneric<Tarefa> daoGeneric = new DaoGeneric<Tarefa>();
	private List<Tarefa> tarefas = new ArrayList<Tarefa>();

	public String cadastrar() {
		tarefa = daoGeneric.merge(tarefa);
		carregarTarefa();
		return "";
	}
	
	public String novo() {
		tarefa = new Tarefa();
		carregarTarefa();
		return "";
	}

	public String deletar() {
		daoGeneric.deletePorId(tarefa);
		tarefa = new Tarefa();
		carregarTarefa();
		return "";
	}
	
	@PostConstruct
	public void carregarTarefa() {
		tarefas = daoGeneric.getListEntity(Tarefa.class);
	}
	
	
	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public DaoGeneric<Tarefa> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Tarefa> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
}
