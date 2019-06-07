package edu.upc.whatsapp.comms;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 * @Authors: BLANCO CAAMANO, Ramon <ramonblancocaamano@gmail.com>
 * GREGORIO DURANTE, Nicola <ng.durante@gmail.com>
 */
public interface Comms {
    String WhatsApp_server = "10.0.2.2:8080/SERVER";
    String url_rpc = "http://" + WhatsApp_server + "/rpc";
    String ENDPOINT = "ws://" + WhatsApp_server + "/push";
    Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateSerializerDeserializer()).create();
}
