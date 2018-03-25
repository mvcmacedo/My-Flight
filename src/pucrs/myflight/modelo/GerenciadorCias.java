package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		this.empresas = new ArrayList<CiaAerea>();
	}

	public void adicionar(CiaAerea cia){
		this.empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas() {
		return empresas;
	}

	public CiaAerea buscarCodigo(String cod){
		CiaAerea cia = null;
		for(CiaAerea c : empresas){
			if(c.getCodigo().equals(cod)){
				cia = c;
			}
		}
		return cia;
	}

	public CiaAerea buscarNome(String nom){
		CiaAerea cia = null;
		for(CiaAerea c : empresas){
			if(c.getNome().equals(nom)){
				cia = c;
			}
		}
		return cia;
	}

	public String toString(){
		String cias = " Companhias Aéreas\n" + "----------------------\n";
		for(int i=0; i < this.empresas.size(); i++){
			cias += "" + this.empresas.get(i) + "\n";
		}
		return cias;
	}
}
