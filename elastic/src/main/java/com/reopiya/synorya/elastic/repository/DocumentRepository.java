package com.reopiya.synorya.elastic.repository;

import com.reopiya.synorya.elastic.model.DocumentEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends ElasticsearchRepository<DocumentEntity, String> {
}

