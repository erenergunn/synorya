package com.reopiya.synorya.elastic.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.reopiya.synorya.elastic.service.ElasticIndexService;

@Component
public class IndexDocumentEventListener {
    private final ElasticIndexService elasticIndexService;

    @Autowired
    public IndexDocumentEventListener(ElasticIndexService elasticIndexService) {
        this.elasticIndexService = elasticIndexService;
    }

    @EventListener
    public void handleIndexDocumentEvent(IndexDocumentEvent event) {
        elasticIndexService.indexDocument(event.getId(), event.getContent());
    }
}
