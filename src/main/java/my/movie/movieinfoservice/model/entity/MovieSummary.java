package my.movie.movieinfoservice.model.entity;

public class MovieSummary {
    private String movieId;
    private String title;
    private String overview;

    public MovieSummary() {

    }

    public MovieSummary(final String movieId, final String title, final String overview) {
        this.movieId = movieId;
        this.title = title;
        this.overview = overview;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(final String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(final String overview) {
        this.overview = overview;
    }
}
