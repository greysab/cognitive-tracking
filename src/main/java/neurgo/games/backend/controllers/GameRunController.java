package neurgo.games.backend.controllers;

import neurgo.games.backend.resources.GameRun;
import neurgo.games.backend.services.GameRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/gamerun")
public class GameRunController {

    private GameRunService gameRunService;

    @Autowired
    public GameRunController(GameRunService gameRunService) {
        this.gameRunService = gameRunService;
    }

    @PostMapping
    public GameRun addUser(@RequestBody GameRun gameRun) {
        return gameRunService.insertGameRunData(gameRun);
    }

    @GetMapping
    public Optional<GameRun> getGameRun(@RequestParam String gameRunID) {
        return gameRunService.getGameRunInformationById(gameRunID);
    }

    @PutMapping
    public GameRun updateGameRun(@RequestParam String gameRunID, @RequestBody GameRun gameRun) {
        return gameRunService.updateGameRunUsingId(gameRunID, gameRun);
    }

    @DeleteMapping
    public void deleteGameRun(@RequestParam String gameRunID) {
        gameRunService.deleteGameRunUsingId(gameRunID);
    }

}
