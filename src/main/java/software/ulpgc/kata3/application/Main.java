package software.ulpgc.kata3.application;

import software.ulpgc.kata3.model.Movie;
import software.ulpgc.kata3.viewmodel.Histogram;
import software.ulpgc.kata3.viewmodel.HistogramBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = new RemoteMovieLoader(MovieDeserializer::fromTsv).loadAll();
        Histogram histogram = new HistogramBuilder(movie -> (movie.year() / 10) * 10).buildWith(movies);
        for (int bin : histogram) {
            System.out.println(bin + ": " + histogram.count(bin));
        }
    }

}
