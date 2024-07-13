package com.api.forumhub.DTO;

import java.time.LocalDateTime;

public record TopicoDTO(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, boolean estado, Long autorId, Long cursoId) {
}