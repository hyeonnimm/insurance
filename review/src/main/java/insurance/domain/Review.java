package insurance.domain;

import insurance.ReviewApplication;
import insurance.domain.Reviewed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Review_table")
@Data
//<<< DDD / Aggregate Root
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Reviewed reviewed = new Reviewed(this);
        reviewed.publishAfterCommit();
    }

    public static ReviewRepository repository() {
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(
            ReviewRepository.class
        );
        return reviewRepository;
    }

    //<<< Clean Arch / Port Method
    public static void readyToReview(ClaimRequested claimRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Review review = new Review();
        repository().save(review);

        */

        /** Example 2:  finding and process
        
        repository().findById(claimRequested.get???()).ifPresent(review->{
            
            review // do something
            repository().save(review);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
