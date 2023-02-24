package pessoas;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Nomes {

	private String nome;
	private String[] nomeSplit;
	private Set<String> feminino = new TreeSet<String>();
	private Set<String> masculino = new TreeSet<String>();
	
	public Nomes() {
		
	}

	public Nomes(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String[] getNomeSplit() {
		return nomeSplit;
	}

	public Set<String> getFeminino() {
		return feminino;
	}

	public void setFeminino(Set<String> feminino) {
		this.feminino = feminino;
	}

	public Set<String> getMasculino() {
		return masculino;
	}

	public void setMasculino(Set<String> masculino) {
		this.masculino = masculino;
	}

	public void splitNome(String nome) {
		nomeSplit = nome.split(",");
		Arrays.sort(nomeSplit);
	}
	
	public void splitNomeGeneros(String nome) {
		nomeSplit = nome.split(",");
		Arrays.sort(nomeSplit);
		for(String nomes : nomeSplit) {
			if(nomes.toLowerCase().contains("-m")) {
				masculino.add(nomes);
			} else if(nomes.toLowerCase().contains("-f")) {
				feminino.add(nomes);
			}
		}
	}

	@Override
	public String toString() {
		return "Nomes= " + Arrays.toString(nomeSplit);
	}
	
	
	
	
	
}
