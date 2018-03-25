package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {

	    // Companhias Aéreas
        CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aéreas");
        CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
        CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
        CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aéreas");

        GerenciadorCias gc = new GerenciadorCias();
        gc.adicionar(c1);
        gc.adicionar(c2);
        gc.adicionar(c3);
        gc.adicionar(c4);
        //System.out.println(gc.toString());

        // Aeronaves
        Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave a3 = new Aeronave("380", "Airbus Industire A380", 644);
        Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);

	    GerenciadorAeronaves ga = new GerenciadorAeronaves();
	    ga.adicionar(a1);
        ga.adicionar(a2);
        ga.adicionar(a3);
        ga.adicionar(a4);
        //System.out.println(ga.toString());

        // Aeroportos
        Aeroporto ae1 = new Aeroporto("POA", "Salgado Filho Intl Apt", -29.9939, -51.1711);
        Aeroporto ae2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", -23.4356	, -46.4731);
        Aeroporto ae3 = new Aeroporto("LIS", "Lisbon", 38.7742, -9.1342);
        Aeroporto ae4 = new Aeroporto("MIA", "Miami International Apt", 25.7933, -80.2906);

        GerenciadorAeroportos gae = new GerenciadorAeroportos();
        gae.adicionar(ae1);
        gae.adicionar(ae2);
        gae.adicionar(ae3);
        gae.adicionar(ae4);
        //System.out.println(gae.toString());

        // Rotas
        Rota r1 = new Rota(c2, ae2, ae1, a1);
        Rota r2 = new Rota(c2, ae1, ae2, a1);
        Rota r3 = new Rota(c3, ae4, ae3, a3);
        Rota r4 = new Rota(c1, ae2, ae3, a2);

        GerenciadorRotas gr = new GerenciadorRotas();
        gr.adicionar(r1);
        gr.adicionar(r2);
        gr.adicionar(r3);
        gr.adicionar(r4);
        //System.out.println(gr.toString());

        //Voos
        LocalDateTime datahora = LocalDateTime.of(2018, 04, 12, 23, 30);
        LocalDateTime datahora1 = LocalDateTime.of(2019, 04, 12, 23, 30);
        Duration duracao = Duration.ofMinutes(120);
        Voo v1 = new Voo(r1, datahora1, duracao);
        Voo v2 = new Voo(r2, datahora, duracao);
        Voo v3 = new Voo(r3, datahora, duracao);
        Voo v4 = new Voo(r4, datahora, duracao);
        Voo v5 = new Voo(r2, datahora, duracao);
        Voo v6 = new Voo(r4, datahora, duracao);
        Voo v7 = new Voo(r3, datahora, duracao);
        Voo v8 = new Voo(r1, datahora, duracao);

        GerenciadorVoos gv = new GerenciadorVoos();
        gv.adicionar(v1);
        gv.adicionar(v2);
        gv.adicionar(v3);
        gv.adicionar(v4);
        gv.adicionar(v5);
        gv.adicionar(v6);
        gv.adicionar(v7);
        gv.adicionar(v8);
        System.out.println(gv.buscarAeropo("POA"));
	}
}
