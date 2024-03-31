package com.rickandmortyapi.model;

import com.google.gson.Gson;
import com.rickandmortyapi.service.ConsumindoApi;

public class Apis {
    public  Personagem personagem(String personagem){
        ConsumindoApi consumindoApi = new ConsumindoApi();
       String json = consumindoApi.obterDados("https://rickandmortyapi.com/api/character/" + personagem);
        Gson gson = new Gson();
        Personagem personagem1 = gson.fromJson(json, Personagem.class);

        return personagem1;

    }

    public  Lugar lugar(String local){
        ConsumindoApi consumindoApi = new ConsumindoApi();
        String json = consumindoApi.obterDados("https://rickandmortyapi.com/api/location/" + local);
        Gson gson = new Gson();
        Lugar lugar = gson.fromJson(json, Lugar.class);

        return lugar;

    }



}
