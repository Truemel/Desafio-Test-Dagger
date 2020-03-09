package com.example.desafiotestdagger.modelo;

import javax.inject.Inject;

public class Conclusion {

    private String texto;
    @Inject
    public Conclusion(){
        texto = " estoy satisfechos con este comienzo.";
    }

    public String lineConclusion(){
        return texto;
    }
}
