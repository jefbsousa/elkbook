package com.jef.elkbook.Config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.index.Settings;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;


@Configuration
@EnableElasticsearchRepositories(basePackages
        = "icom.jef.elkbook.repository")
@ComponentScan(basePackages = { "com.jef.elkbook" })
public class ElkConfig  extends AbstractElasticsearchConfiguration {

    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {

        final ClientConfiguration clientConfiguration =
                ClientConfiguration
                        .builder()
                        .connectedTo("localhost:9200")
                        .build();

        return RestClients.create(clientConfiguration).rest();
    }
}
