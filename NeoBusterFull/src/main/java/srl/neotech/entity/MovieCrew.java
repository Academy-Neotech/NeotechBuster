package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Movie_CrewEntity")
@Table(name = "movie_crew")
public class MovieCrew implements Serializable {
    private static final long serialVersionUID = 3139304463782020671L;
    private MovieCrewId id;

    private Movie movie;

    private Person person;

    private Department department;

    @EmbeddedId
    public MovieCrewId getId() {
        return id;
    }

    public void setId(MovieCrewId id) {
        this.id = id;
    }

    @MapsId("movieId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @MapsId("personId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @MapsId("departmentId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}