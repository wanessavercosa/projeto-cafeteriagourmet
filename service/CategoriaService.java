package com.chouchougourmet.projeto.service;

import com.chouchougourmet.projeto.model.entity.Categoria;
import com.chouchougourmet.projeto.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    // Listar todas as categorias
    @Transactional(readOnly = true)
    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    // Buscar categoria pelo ID
    @Transactional(readOnly = true)
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Categoria não encontrada."
                        )
                );
    }

    // Cadastrar categoria
    @Transactional
    public Categoria cadastrar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Atualizar categoria
    @Transactional
    public Categoria atualizar(Long id, Categoria dados) {

        Categoria categoria = buscarPorId(id);

        categoria.setNome(dados.getNome());
        categoria.setDescricao(dados.getDescricao());

        return categoriaRepository.save(categoria);
    }

    // Excluir categoria
    @Transactional
    public void excluir(Long id) {

        Categoria categoria = buscarPorId(id);

        categoriaRepository.delete(categoria);
    }
}
