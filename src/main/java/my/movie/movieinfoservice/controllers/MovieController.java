package my.movie.movieinfoservice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.movie.movieinfoservice.model.entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") final String movieId) {
        return new Movie("1", "Name1");
    }
}
