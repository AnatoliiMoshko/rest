package com.example.rest.rest.service.impl;

import com.example.rest.rest.exception.EntityNotFoundException;
import com.example.rest.rest.model.Client;
import com.example.rest.rest.model.Order;
import com.example.rest.rest.repository.ClientRepository;
import com.example.rest.rest.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
//@NoArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format("Клиент с ID {0} не найден", id)));
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.update(client);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client saveWithOrders(Client client, List<Order> orders) {
        throw new NotImplementedException();
    }
}
