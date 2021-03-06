package my.movie.movieinfoservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import my.movie.movieinfoservice.model.entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Value("${api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    @Autowired
    public MovieController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") final String movieId) {
        final Movie movie = restTemplate.getForObject("https://api.themoviedb.org/movie/" + movieId + "?api_key=" + apiKey, Movie.class);

        return movie;
    }
}
