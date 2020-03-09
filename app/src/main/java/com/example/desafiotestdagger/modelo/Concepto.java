package com.example.desafiotestdagger.modelo;

import javax.inject.Inject;

public class Concepto {

    private String texto;
    private Clase clase;
    @Inject
    public Concepto(Clase clase){
        texto = " he aprendido nuevos conceptos en esta materia ";
        this.clase = clase;
    }

    public String lineConcepto(){
        return texto+clase.lineClase();
    }
}
