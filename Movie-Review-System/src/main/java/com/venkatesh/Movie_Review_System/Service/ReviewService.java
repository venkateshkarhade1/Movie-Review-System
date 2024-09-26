package com.venkatesh.Movie_Review_System.Service;

import com.venkatesh.Movie_Review_System.Model.Movie;
import com.venkatesh.Movie_Review_System.Model.Review;
import com.venkatesh.Movie_Review_System.Repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepo reviewrepo;

    @Autowired
    private MongoTemplate template;


    public Review createReview(String reviewBody, String id){

        Review review = new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now());
        reviewrepo.insert(review);
        template.update(Movie.class)
                .matching(Criteria.where("id").is(id))
                .apply(new Update().push("reviewIds").value(review.getId()))
                .first();
        return review;
    }
}
