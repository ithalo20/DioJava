package main.java.map.Ordenacao;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //Atributos, LocalDate pq vamos trabalhar com data como no exercicios
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventoMap); //TreeMap para deixar crescente, igual o TreeSet
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventoMap); //TreeMap para deixar crescente, igual o TreeSet
        //System.out.println(eventosTreeMap);
        //eventoMap.get()

        LocalDate dataAtual = LocalDate.now(); //now me retorna data atual
        LocalDate proximaData = null; //Vazio por enquanto
        Evento proximoEvento = null; //Vazio por enquanto
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventoMap); //Reutilizando TreeMap do exibir agenda, pra deixar em ordem crescente
        for (Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()) { //Map.Entry e entrySet consegue distinguir Key e Value, então consigo colocar os dois.
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break; //O break para aparecer apenas 1 próximo evento, se eu tiver mostra todos proximos eventos depois
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 4), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento(); //Pegará o próximo evento
    }
}
