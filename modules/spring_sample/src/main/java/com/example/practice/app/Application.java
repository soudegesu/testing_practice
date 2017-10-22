package com.example.practice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * アプリケーション起動クラス
 * @since 2017/10/22
 */
@SpringBootApplication
public class Application {

    /**
     * アプリケーションメイン
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args); // NOSONAR ignore "Close this "ConfigurableApplicationContext"
        context.registerShutdownHook();
    }
}
