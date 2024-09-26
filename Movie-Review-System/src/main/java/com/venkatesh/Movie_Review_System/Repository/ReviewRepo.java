package com.venkatesh.Movie_Review_System.Repository;

import com.venkatesh.Movie_Review_System.Model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends MongoRepository<Review, ObjectId> {

}
