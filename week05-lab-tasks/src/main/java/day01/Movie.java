package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> movieTime;

    public Movie(String title, List<LocalDateTime> movieTime) {
        this.title = title;
        this.movieTime = movieTime;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getMovieTime() {
        return movieTime;
    }
}
