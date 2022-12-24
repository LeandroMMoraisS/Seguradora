package SeguradoraAPi.SeguradoraApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SeguradoraAPi.SeguradoraApi.Models.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Integer>{

}
