package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

import io.awspring.cloud.core.region.RegionProvider;

@Configuration
public class SqsConfig {

    @Bean
    AmazonSQSAsync amazonSQS(
            AWSCredentialsProvider awsCredentialsProvider, 
            RegionProvider regionProvider) {
                
        return AmazonSQSAsyncClientBuilder.standard()
            .withCredentials(awsCredentialsProvider)
            .withRegion(regionProvider.getRegion().getName()).build();
    }
}
