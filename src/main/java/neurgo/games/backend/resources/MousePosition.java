package neurgo.games.backend.resources;

public class MousePosition {

    private Integer xPosition;
    private Integer yPosition;

    public MousePosition() {
    }

    public MousePosition(Integer xPosition, Integer yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }
}
