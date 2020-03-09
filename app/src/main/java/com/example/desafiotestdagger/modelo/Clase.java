package com.example.desafiotestdagger.modelo;

import javax.inject.Inject;

public class Clase {

    private String texto;
    private Conclusion conclusion;
    @Inject
    public Clase(Conclusion conclusion){
        texto = "y con este buen grupo, me siento motivado y";
        this.conclusion = conclusion;
    }

    public String lineClase(){
        return texto+conclusion.lineConclusion();
    }
}
