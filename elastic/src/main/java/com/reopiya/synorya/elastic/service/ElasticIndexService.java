package com.reopiya.synorya.elastic.service;

import com.reopiya.synorya.elastic.model.DocumentEntity;
import com.reopiya.synorya.elastic.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElasticIndexService {
    private final DocumentRepository documentRepository;

    @Autowired
    public ElasticIndexService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public void indexDocument(String id, String content) {
        DocumentEntity doc = new DocumentEntity(id, content);
        documentRepository.save(doc);
    }
}
