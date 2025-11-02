package software.ulpgc.kata3.io;

import software.ulpgc.kata3.model.Movie;

import java.util.List;

public interface MovieLoader {

    public List<Movie> loadAll();

}
