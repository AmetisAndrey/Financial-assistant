package com.financial.financial_assistant.model.enums;

public enum Currency {
    RUB("Российский рубль", "₽", 643),
    USD("Доллар США", "$", 840),
    EUR("Евро", "€", 978),
    GBP("Фунт стерлингов", "£", 826),
    JPY("Японская йена", "¥", 392),
    CNY("Китайский юань", "¥", 156),
    CHF("Швейцарский франк", "Fr", 756),
    KZT("Казахстанский тенге", "₸", 398),
    BYN("Белорусский рубль", "Br", 933);

    private final String displayName;
    private final String symbol;
    private final int numericCode;

    Currency(String displayName, String symbol, int numericCode) {
        this.displayName = displayName;
        this.symbol = symbol;
        this.numericCode = numericCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public static Currency fromNumericCode(int code) {
        for (Currency currency : values()) {
            if (currency.getNumericCode() == code) {
                return currency;
            }
        }
        throw new IllegalArgumentException("Unknown currency code: " + code);
    }
}