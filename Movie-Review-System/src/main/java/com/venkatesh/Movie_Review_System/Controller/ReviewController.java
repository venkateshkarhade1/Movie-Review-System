package com.venkatesh.Movie_Review_System.Controller;

import com.venkatesh.Movie_Review_System.Model.Review;
import com.venkatesh.Movie_Review_System.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    ReviewService reviewservice;

    @PostMapping()
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){

        return new ResponseEntity<>(reviewservice.createReview(payload.get("reviewBody"), payload.get("id")), HttpStatus.OK);
    }

}
