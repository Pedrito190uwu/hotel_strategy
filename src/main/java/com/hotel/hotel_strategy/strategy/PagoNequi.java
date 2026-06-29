package com.hotel.hotel_strategy.strategy;

public class PagoNequi implements MetodoPago {

    @Override
    public String pagar(double monto) {
        return "Pago de $" + monto + " realizado con Nequi.";
    }

}