package com.dio.projectexpertssession.config;

import org.springframework.data.elasticsearch.core.convert.ElasticsearchCustomConversions;
import org.springframework.data.elasticsearch.core.mapping.SimpleElasticsearchMappingContext;

public class ElasticsearchEntityMapper {
    public ElasticsearchEntityMapper(SimpleElasticsearchMappingContext elasticsearchMappingContext) {
    }

    public void setConversions(ElasticsearchCustomConversions elasticsearchCustomConversions) {
    }
}
