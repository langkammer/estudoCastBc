package com.example.demo.service;

import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public void deletar (Long id){
        clienteRepository.deleteById(id);
    }
    public List<Cliente> list(){
        return clienteRepository.findAll();
    }
    public List<Cliente> filtrar(Long id){
        return clienteRepository.findAll();

    }
    public Cliente get(Long id){
        return clienteRepository.getOne(id);
    }
}
