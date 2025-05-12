package com.github.kolesovv.clapper;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET(value = "movie?limit=40&rating.kp=7-10&sortField=votes.kp&sortType=-1")
    Single<MovieResponse> loadMovies(@Header("X-API-KEY") String apiKey, @Query("page") int page);

    @GET(value = "movie/{id}")
    Single<TrailerResponse> loadTrailers(@Header("X-API-KEY") String apiKey, @Path("id") int id);
}
