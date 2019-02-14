package com.example.mateus.mytasks.entities;

import java.util.AbstractMap;
import java.util.HashMap;

public class FullParameters {
    public String method;
    public String url;
    public AbstractMap<String, String> headerParameters;
    public AbstractMap<String, String> params;

    public FullParameters(String method, String url, HashMap headerParameters, HashMap params){
        this.method = method;
        this.url = url;
        this.headerParameters = headerParameters;
        this.params = params;


    }
}
