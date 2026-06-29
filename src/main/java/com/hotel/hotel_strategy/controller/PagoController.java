package com.hotel.hotel_strategy.controller;

import com.hotel.hotel_strategy.service.PagoService;
import com.hotel.hotel_strategy.strategy.PagoNequi;
import com.hotel.hotel_strategy.strategy.PagoPaypal;
import com.hotel.hotel_strategy.strategy.PagoTarjeta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagoController {

    @GetMapping("/pago/{metodo}/{monto}")
    public String pagar(@PathVariable String metodo, @PathVariable double monto) {

        PagoService pagoService = new PagoService();

        switch (metodo.toLowerCase()) {
            case "tarjeta":
                pagoService.setMetodoPago(new PagoTarjeta());
                break;
            case "nequi":
                pagoService.setMetodoPago(new PagoNequi());
                break;
            case "paypal":
                pagoService.setMetodoPago(new PagoPaypal());
                break;
            default:
                return "Método de pago no válido.";
        }

        return pagoService.realizarPago(monto);
    }
}