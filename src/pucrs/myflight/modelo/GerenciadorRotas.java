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

    public String localPorCia(CiaAerea cia){
        ArrayList<Aeroporto> busca = new ArrayList<Aeroporto>();
        Aeroporto aux;
        String local = "";
        for(Rota r : rotas) {
            if (r.getCia().equals(cia)) {
                aux = r.getOrigem();
                if (!(busca.contains(aux))) busca.add(aux);

                aux = r.getDestino();
                if (!(busca.contains(aux))) busca.add(aux);
            }
        }

        for(Aeroporto a : busca){
            local += "Aeroporto: " + a.getCodigo() + "\nLocalização: " + a.getLatitude() + ", " + a.getLongitude() + "\n\n";
        }
        return local;
    }

    public ArrayList<CiaAerea> buscaTipoAviao(String desc){
        ArrayList<CiaAerea> cias = new ArrayList<CiaAerea>();
        for(Rota r : rotas){
            if(r.getAeronave().getDescricao().equals(desc)){
                if(!(cias.contains(r.getCia()))) cias.add(r.getCia());
            }
        }
        return cias;
    }

    public String toString(){
        String rotas = " Rotas\n" + "----------------------\n";
        for(int i=0; i < this.rotas.size(); i++){
            rotas += "" + this.rotas.get(i) + "\n";
        }
        return rotas;
    }
}
