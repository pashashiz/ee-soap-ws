package com.ps.tutorial.model.currency;

public enum Currency {

    UAH,
    EUR,
    USD;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
