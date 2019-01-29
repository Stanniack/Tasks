package com.example.mateus.mytasks.entities;

public class APIResponse {
    public String json;
    public int statusCode;

    public APIResponse(String json, int statusCode) {
        this.json = json;
        this.statusCode = statusCode;
    }
}
