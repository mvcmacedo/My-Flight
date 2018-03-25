package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        this.rotas = new ArrayList<Rota>();
    }

    public void adicionar(Rota r){
        this.rotas.add(r);
    }

    public ArrayList<Rota> listarTodas(){
        return rotas;
    }

    public ArrayList<Rota> buscaPorOrigem(Aeroporto orig){
        ArrayList<Rota> busca = new ArrayList<Rota>();
        for(Rota r : rotas){
            if(r.getOrigem().equals(orig)){
                busca.add(r);
            }
        }
        return busca;
    }

    public String toString(){
        String rotas = " Rotas\n" + "----------------------\n";
        for(int i=0; i < this.rotas.size(); i++){
            rotas += "" + this.rotas.get(i) + "\n";
        }
        return rotas;
    }




}
