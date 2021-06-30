package neurgo.games.backend.repositories;

import neurgo.games.backend.resources.GameRun;
import neurgo.games.backend.resources.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRunRepository extends MongoRepository<GameRun, String>{
}
