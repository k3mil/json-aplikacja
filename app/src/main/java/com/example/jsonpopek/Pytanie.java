package com.example.jsonpopek;

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
}
