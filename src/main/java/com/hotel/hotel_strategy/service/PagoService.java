package com.hotel.hotel_strategy.service;

import com.hotel.hotel_strategy.strategy.MetodoPago;

public class PagoService {

    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String realizarPago(double monto) {
        return metodoPago.pagar(monto);
    }
}