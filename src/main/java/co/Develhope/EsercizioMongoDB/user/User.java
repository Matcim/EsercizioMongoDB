package co.Develhope.EsercizioMongoDB.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String surname;

    @Field
    private String city;

    @Field
    @Indexed(unique = true)
    private String email;
}

