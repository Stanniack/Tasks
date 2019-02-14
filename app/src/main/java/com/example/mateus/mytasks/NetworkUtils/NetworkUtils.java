package com.example.mateus.mytasks.NetworkUtils;

import android.content.Context;
import android.net.ConnectivityManager;

public class NetworkUtils {

    public static boolean estaConectado(Context context){

        // cria var para verificar conexão pegando a informação do sistema com o contexto
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        // Se a conexão for diferente de null e a conexão estiver conecetada ou conectando
        return manager.getActiveNetworkInfo() != null && manager.getActiveNetworkInfo().isConnectedOrConnecting();

    }
}
