package com.dio.projectexpertssession.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.mapping.SimpleElasticsearchMappingContext;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.dio.projectexpertssession.repository")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    private Object DefaultConversionService;

    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:8080")
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    public ElasticsearchEntityMapper entityMapper() {
        SimpleElasticsearchMappingContext elasticsearchMappingContext = (SimpleElasticsearchMappingContext) DefaultConversionService;
        ElasticsearchEntityMapper entityMapper =
                new ElasticsearchEntityMapper(elasticsearchMappingContext);
                new DefaultConversionService();
        entityMapper.setConversions(elasticsearchCustomConversions());

        return entityMapper;
    }

}
