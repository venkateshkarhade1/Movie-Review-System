package com.venkatesh.Movie_Review_System.Repository;

import com.venkatesh.Movie_Review_System.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

        Optional<Movie> findMovieByImdbId(String imdbId);

}
