package vendas.model;

public class Cliente {
	private int id;

	private String nome;

	private String cpf;

	public int setId;

	@Override
	public String toString() {
		return " [ID= "+ id  +"Nome=" + nome + ", cpf=" + cpf + "]";
	}

	public Cliente() {
	}
	

	public Cliente(int id, String cpf, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isNew() {
		if (id == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String getPreco() {

		return null;
	}

	public boolean containsKey(int id2) {
		
		return false;
	}

	public void setNome(int nome2) {
		
	}


	
	
}
