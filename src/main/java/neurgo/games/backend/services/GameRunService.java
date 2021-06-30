package neurgo.games.backend.services;

import neurgo.games.backend.repositories.GameRunRepository;
import neurgo.games.backend.resources.GameRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class GameRunService {
    @Autowired
    private GameRunRepository gameRunRepository;

    public GameRun insertGameRunData(GameRun gameRun) {
        return gameRunRepository.insert(gameRun);
    }

    public Optional<GameRun> getGameRunInformationById(String id) {
        return gameRunRepository.findById(id);
    }

    public GameRun updateGameRunUsingId(String id, GameRun gameRun) {
        Optional<GameRun> findGameRunQuery = gameRunRepository.findById(id);
        GameRun gameRunValues = findGameRunQuery.get();
        gameRunValues.setId(gameRun.getId());
        gameRunValues.setStartDate(gameRun.getStartDate());
        gameRunValues.setEndDate(gameRun.getEndDate());
        gameRunValues.setScore(gameRun.getScore());
        gameRunValues.setMousePositions(gameRun.getMousePositions());
        gameRunValues.setPlays(gameRun.getPlays());
        gameRunValues.setGame(gameRun.getGame());
        return gameRunRepository.save(gameRunValues);
    }

    public void deleteGameRunUsingId(String id) {
        try {
            gameRunRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
