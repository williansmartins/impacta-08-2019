package com.williansmartins.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.model.Tag;

public interface TagsRepository extends CrudRepository<Tag, Long> {
	
	void save(Imagem imagem);
}
