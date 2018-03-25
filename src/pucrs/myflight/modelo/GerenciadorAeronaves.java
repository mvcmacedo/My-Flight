package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        this.aeronaves = new ArrayList<Aeronave>();
    }

    public void adicionar(Aeronave aviao){
        this.aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        return aeronaves;
    }

    public Aeronave buscarPorCodigo(String cod){
        Aeronave aeronave = null;
        for(Aeronave a : aeronaves){
            if(a.getCodigo().equals(cod)){
                aeronave = a;
            }
        }
        return aeronave;
    }

    public String toString(){
        String aeros = " Aeronaves\n" + "----------------------\n";
        for(int i=0; i < this.aeronaves.size(); i++){
            aeros += "" + this.aeronaves.get(i) + "\n";
        }
        return aeros;
    }

}
