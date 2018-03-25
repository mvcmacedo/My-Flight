package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        this.voos = new ArrayList<Voo>();
    }

    public void adicionar(Voo v){
        this.voos.add(v);
    }

    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public ArrayList<Voo> buscarPorData(LocalDateTime data) {
        ArrayList<Voo> busca = new ArrayList<Voo>();
        for(Voo v : voos){
            if(v.getDatahora().equals(data)){
                busca.add(v);
            }
        }
        return busca;
    }

    public ArrayList<Voo> buscarAeropo(String cod) {
        ArrayList<Voo> busca = new ArrayList<Voo>();
        for(Voo v : voos){
            if(v.getRota().getOrigem().getCodigo().equals(cod) || v.getRota().getDestino().getCodigo().equals(cod)){
                busca.add(v);
            }
        }
        return busca;
    }

    public String toString(){
        String voos = " Voos\n" + "----------------------\n";
        for(int i=0; i < this.voos.size(); i++){
            voos += "" + this.voos.get(i) + "\n";
        }
        return voos;
    }

}
