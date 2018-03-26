package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {

        public static void main(String[] args) {

                // Companhias Aéreas
                GerenciadorCias gc = new GerenciadorCias();

                CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aéreas", gc);
                CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA", gc);
                CiaAerea c3 = new CiaAerea("TP", "TAP Portugal", gc);
                CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aéreas", gc);
                //System.out.println(gc.toString());

                // Aeronaves
                GerenciadorAeronaves ga = new GerenciadorAeronaves();

                Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140, ga);
                Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126, ga);
                Aeronave a3 = new Aeronave("380", "Airbus Industire A380", 644, ga);
                Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304, ga);
                //System.out.println(ga.toString());

                // Aeroportos
                GerenciadorAeroportos gae = new GerenciadorAeroportos();

                Aeroporto ae1 = new Aeroporto("POA", "Salgado Filho Intl Apt", -29.9939, -51.1711, gae);
                Aeroporto ae2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", -23.4356	, -46.4731, gae);
                Aeroporto ae3 = new Aeroporto("LIS", "Lisbon", 38.7742, -9.1342, gae);
                Aeroporto ae4 = new Aeroporto("MIA", "Miami International Apt", 25.7933, -80.2906, gae);
                //System.out.println(gae.toString());

                // Rotas
                GerenciadorRotas gr = new GerenciadorRotas();

                Rota r1 = new Rota(c2, ae2, ae1, a1, gr);
                Rota r2 = new Rota(c2, ae1, ae2, a1, gr);
                Rota r3 = new Rota(c3, ae4, ae3, a3, gr);
                Rota r4 = new Rota(c1, ae2, ae3, a2, gr);
                //System.out.println(gr.toString());
                //System.out.println(gr.localPorCia(c2));
                //System.out.println(gr.buscaTipoAviao("Boeing 737-300"));

                //Voos
                GerenciadorVoos gv = new GerenciadorVoos();
                LocalDateTime datahora = LocalDateTime.of(2018, 04, 12, 23, 30);
                LocalDateTime datahora1 = LocalDateTime.of(2019, 04, 12, 23, 30);
                Duration duracao = Duration.ofMinutes(120);
                Duration duracao1 = Duration.ofMinutes(100);

                Voo v1 = new Voo(r1, datahora1, duracao, gv);
                Voo v2 = new Voo(r2, datahora, duracao1, gv);
                Voo v3 = new Voo(r3, datahora, duracao, gv);
                Voo v4 = new Voo(r4, datahora1, duracao1, gv);
                Voo v5 = new Voo(r2, datahora, duracao, gv);
                Voo v6 = new Voo(r4, datahora1, duracao1, gv);
                Voo v7 = new Voo(r3, datahora, duracao, gv);
                Voo v8 = new Voo(r1, datahora, duracao1, gv);
                //System.out.println(gv.toString());
                //System.out.println(gv.buscarAeropo("POA"));
        }
}
