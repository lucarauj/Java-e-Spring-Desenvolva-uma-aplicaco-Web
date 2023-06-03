package br.com.lucarauj.screenmatch.repository;

import br.com.lucarauj.screenmatch.domain.filme.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
