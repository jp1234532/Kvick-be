package com.bezkoder.springjwt;

public enum BusinessType {
    DRYCLEANER ("Kemtvätt"),
    SKOMAKARE ("Skomakare"),
    RESTAURANT ("Restaurant"),
    LIVSMEDELSBUTIK ("Livsmedelsbutik");

    private final String strTyp;

    public String getStrTyp() {
        return strTyp;
    }

    BusinessType(String strTyp) {
        this.strTyp = strTyp;
    }
}
