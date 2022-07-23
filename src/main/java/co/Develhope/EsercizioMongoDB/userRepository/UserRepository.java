package co.Develhope.EsercizioMongoDB.userRepository;

import co.Develhope.EsercizioMongoDB.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
