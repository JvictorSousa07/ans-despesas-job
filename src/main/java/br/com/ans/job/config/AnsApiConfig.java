package br.com.ans.job.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnsApiConfig {

    @Value("${ans.api.base-url}")
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }
}