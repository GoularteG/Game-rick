package com.rickandmortyapi.model;

import com.rickandmortyapi.service.ConsumindoApi;

public class ConsumindoApiPersonagem extends ConsumindoApi {
    public  ConsumindoApi Personagem(String personagem){
        var json = Personagem("https://rickandmortyapi.com/api/character/" + personagem);
        return json;
    }

    public  ConsumindoApi local (String local){
        var jsonDois= local()
    }



}
