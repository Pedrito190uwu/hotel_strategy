package com.hotel.hotel_strategy.strategy;

public class PagoTarjeta implements MetodoPago {

    @Override
    public String pagar(double monto) {
        return "Pago de $" + monto + " realizado con Tarjeta.";
    }

}