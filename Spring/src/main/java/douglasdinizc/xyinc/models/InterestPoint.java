package douglasdinizc.xyinc.models;

import javax.persistence.*;

@Entity
@Table(name = "interest_points")
public class InterestPoint {
    // Constructors
    public InterestPoint(){}

    public InterestPoint(String name, Integer x_coordinate, Integer y_coordinate) {
        this.name = name;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Integer x_coordinate;
    private Integer y_coordinate;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(Integer x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public Integer getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(Integer y_coordinate) {
        this.y_coordinate = y_coordinate;
    }
}
