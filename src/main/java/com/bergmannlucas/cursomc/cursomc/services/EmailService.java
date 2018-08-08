package com.bergmannlucas.cursomc.cursomc.services;

import com.bergmannlucas.cursomc.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);
}
