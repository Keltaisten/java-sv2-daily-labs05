package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        movies.add(movie);


    }

    public List<String> findMovieByTime(LocalDateTime time){
        List<String> foundMovies = new ArrayList<>();
        for(Movie mov: movies){
//            if(mov.getMovieTime().)
            for(LocalDateTime loc: mov.getMovieTime()){
                if(loc.equals(time)){
                    foundMovies.add(mov.getTitle());
                }
            }
        }
        return foundMovies;
    }
}
