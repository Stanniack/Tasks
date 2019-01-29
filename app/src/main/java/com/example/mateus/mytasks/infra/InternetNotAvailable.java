package com.example.mateus.mytasks.infra;

public class InternetNotAvailable extends Exception{

    public InternetNotAvailable(String msg){
        super(msg);
    }
}
