package com.github.kolesovv.clapper;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavoriteMovieViewModel extends AndroidViewModel {

    private final MovieDAO movieDAO;

    public FavoriteMovieViewModel(@NonNull Application application) {
        super(application);
        movieDAO = MovieDataBase.getInstance(application).movieDAO();
    }

    public LiveData<List<Movie>> getAll() {
        return movieDAO.getAllFavoriteMovies();
    }
}
