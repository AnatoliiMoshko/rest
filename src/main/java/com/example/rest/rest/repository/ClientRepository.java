package com.example.rest.rest.repository;

import com.example.rest.rest.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    List<Client> findAll();
    Optional<Client> findById(Long id);
    Client save(Client client);
    Client update(Client client);
    void deleteById(Long id);
}
