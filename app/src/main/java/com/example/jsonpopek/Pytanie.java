package com.example.jsonpopek;

import com.google.gson.annotations.SerializedName;

public class Pytanie {

    @SerializedName("tresc_pytania")
    public String trescPytania;
    @SerializedName("odpA")
    public String odpA;
    @SerializedName("odpB")
    public String odpB;
    @SerializedName("odpC")
    public String odpC;

    public int poprawnaOdpowiedź;

    public Pytanie(String trescPytania, String odpA, String odpB, String odpC, int poprawnaOdpowiedź) {
        this.trescPytania = trescPytania;
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.poprawnaOdpowiedź = poprawnaOdpowiedź;
    }
}
