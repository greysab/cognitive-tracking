package neurgo.games.backend.resources;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document(collection = "GameRuns")
public class GameRun {
    @Id
    private String id;
    private Date startDate;
    private Date endDate;
    private Integer score;
    private ArrayList<MousePosition> mousePositions;
    private ArrayList<Play> plays;
    private Games game;

    public GameRun() {
    }

    public GameRun(String id, Date startDate, Date endDate, Integer score, ArrayList<MousePosition> mousePositions, ArrayList<Play> plays, Games game) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.score = score;
        this.mousePositions = mousePositions;
        this.plays = plays;
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ArrayList<MousePosition> getMousePositions() {
        return mousePositions;
    }

    public void setMousePositions(ArrayList<MousePosition> mousePositions) {
        this.mousePositions = mousePositions;
    }

    public ArrayList<Play> getPlays() {
        return plays;
    }

    public void setPlays(ArrayList<Play> plays) {
        this.plays = plays;
    }

    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }
}
