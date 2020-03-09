package com.example.desafiotestdagger;

import com.example.desafiotestdagger.modelo.Curso;

import dagger.Component;

@Component
public interface AppComp {
    public Curso getCurso();
}
