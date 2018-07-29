package com.bergmannlucas.cursomc.cursomc.services;

import com.bergmannlucas.cursomc.cursomc.domain.Pedido;
import com.bergmannlucas.cursomc.cursomc.repositories.PedidoRepository;
import com.bergmannlucas.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
