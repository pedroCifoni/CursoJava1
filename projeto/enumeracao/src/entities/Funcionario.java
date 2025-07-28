package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelContrato;

public class Funcionario {
	private String name;
	private NivelContrato nivel;
	private Double salarioBase;
	
	//apenas uma associacao, ou seja, o funcionario so tem um departamento
	private Departamento departamento;
	
	//mais de uma associacao, "*", ou seja varios 
	//obs: nao incluir no construtor quando for tipo "varios"
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String name, NivelContrato nivel, Double salarioBase, Departamento departamento) {
		super();
		this.name = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelContrato getNivel() {
		return nivel;
	}

	public void setNivel(NivelContrato nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
	
	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double ganhoAno(int ano, int mes) {
		double ganhoTotal = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoHora c : contratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				ganhoTotal += c.valorTotal();
			}
		}
		return ganhoTotal;
		
	}
	
	
}
