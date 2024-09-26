package com.venkatesh.Movie_Review_System.Service;

import com.venkatesh.Movie_Review_System.Model.Movie;
import com.venkatesh.Movie_Review_System.Repository.MovieRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movierepo;

    public List<Movie> allMovie(){

        return movierepo.findAll();

    }

    public Optional<Movie> singlemovie(ObjectId id) {

        return movierepo.findById(id);
    }


}
