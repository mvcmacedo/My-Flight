package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        this.aeroportos = new ArrayList<Aeroporto>();
    }

    public void adicionar(Aeroporto a){
        this.aeroportos.add(a);
    }

    public ArrayList<Aeroporto> listarTodos() {
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String cod){
        Aeroporto aeroporto = null;
        for(Aeroporto a : aeroportos){
            if(a.getCodigo().equals(cod)){
                aeroporto = a;
            }
        }
        return aeroporto;
    }

    public String toString(){
        String aeros = " Aeroportos\n" + "----------------------\n";
        for(int i=0; i < this.aeroportos.size(); i++){
            aeros += "" + this.aeroportos.get(i) + "\n";
        }
        return aeros;
    }

}
