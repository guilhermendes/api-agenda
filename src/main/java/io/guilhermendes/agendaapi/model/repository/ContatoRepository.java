package io.guilhermendes.agendaapi.model.repository;

import io.guilhermendes.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
