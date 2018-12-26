package com.atguigu.providerticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 写好prodider 利用package打包成两个jar 8001 8002
 * 在cmd中运行两个java -jar provider-ticket-0.0.1-SNAPSHOT-8002.jar
 */
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}

