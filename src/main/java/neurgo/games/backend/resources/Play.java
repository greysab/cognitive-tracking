package neurgo.games.backend.resources;

public class Play {

    private Integer delay;
    private String color;

    public Play() {
    }

    public Play(Integer delay, String color) {
        this.delay = delay;
        this.color = color;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
