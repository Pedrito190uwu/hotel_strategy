package com.hotel.hotel_strategy.strategy;

public class PagoPaypal implements MetodoPago {

    @Override
    public String pagar(double monto) {
        return "Pago de $" + monto + " realizado con PayPal.";
    }

}