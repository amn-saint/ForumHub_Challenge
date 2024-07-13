package com.api.forumhub.repository;

import com.api.forumhub.domain.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByAutorIsNotNull();
}