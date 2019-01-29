package com.example.mateus.mytasks.entities;

import java.util.AbstractMap;
import java.util.HashMap;

public class FullParameters {
    public String method;
    public String url;
    public AbstractMap<String, String> headerParametros;
    public AbstractMap<String, String> parametros;

    public FullParameters(String method, String url, HashMap headerParametros, HashMap parametros){
        this.method = method;
        this.url = url;
        this.headerParametros = headerParametros;
        this.parametros = parametros;


    }
}
