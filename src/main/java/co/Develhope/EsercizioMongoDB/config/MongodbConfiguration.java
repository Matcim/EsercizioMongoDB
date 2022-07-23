package co.Develhope.EsercizioMongoDB.config;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongodbConfiguration extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName(){
        return "matteo";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://matteo:cWP2rnYwPD9OrLiW@cluster0.v1ul9.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString).build();
        return MongoClients.create(mongoClientSettings);
    }


    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("co.matteo");
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }
}
