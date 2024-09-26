package com.venkatesh.Movie_Review_System.Controller;

import com.venkatesh.Movie_Review_System.Model.Movie;
import com.venkatesh.Movie_Review_System.Service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieservice;
    @GetMapping
    public ResponseEntity<List<Movie>> getallmovies(){

        return new ResponseEntity<>(movieservice.allMovie(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getsinglemovie(@PathVariable ObjectId id){

        return new ResponseEntity<Optional<Movie>>(movieservice.singlemovie(id), HttpStatus.OK);
    }
}
