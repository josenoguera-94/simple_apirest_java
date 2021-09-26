package com.example.api;
import io.github.cdimascio.dotenv.Dotenv;

public class ConfigProperties {

    Dotenv dotenv = Dotenv.load();
    private String DBUrl = dotenv.get("SPRING_DATASOURCE_LOCAL", "jdbc:mysql://127.0.0.1:3307/spring_api?createDatabaseIfNotExist=true");
    private String DBUsername = dotenv.get("SPRING_DB_USERNAME", "root");
    private String DBPassword = dotenv.get("SPRING_DB_PASSWORD", "");
    private String DBAutoUpdate = dotenv.get("SPRING_AUTO_UPDATE_DB", "update");
    public void config(){

        System.setProperty("spring.datasource.url", DBUrl);
        System.setProperty("spring.datasource.username", DBUsername);
        System.setProperty("spring.datasource.password", DBPassword);
        System.setProperty("spring.jpa.hibernate.ddl-auto", DBAutoUpdate);
    }

}
