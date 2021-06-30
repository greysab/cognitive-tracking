package neurgo.games.backend.repositories;

import neurgo.games.backend.resources.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
}
