package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    // Conexión para la primera base de datos
    @Bean
    public MongoDatabaseFactory mongoDbFactory1() {
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/database1");
    }

    @Bean
    public MongoTemplate mongoTemplate1() {
        return new MongoTemplate(mongoDbFactory1());
    }

    // Conexión para la segunda base de datos
    @Bean
    public MongoDatabaseFactory mongoDbFactory2() {
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/database2");
    }

    @Bean
    public MongoTemplate mongoTemplate2() {
        return new MongoTemplate(mongoDbFactory2());
    }

}
