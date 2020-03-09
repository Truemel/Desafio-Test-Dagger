package com.example.desafiotestdagger.modelo;

import javax.inject.Inject;

public class Curso {

    private String texto;
    private Concepto concepto;
    @Inject
    public Curso(Concepto concepto){
        texto = "Con este curso de arquitectura de desafío latam";
        this.concepto = concepto;
    }

    public String lineCurso(){
        return texto+concepto.lineConcepto();
    }
}
