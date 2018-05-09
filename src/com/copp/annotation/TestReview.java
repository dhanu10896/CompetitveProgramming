package com.copp.annotation;

@Review(status = Review.ReviewStatus.PASSED)
public class TestReview {
/*
Can be used like below
 // Have default for status and comments. Maybe the code is new.
   @Review()
// Leave status as Pending, but add some comments
    @Review(comments="Have scheduled code review on December 1, 2017")
// Fail the review with comments
    @Review(status=ReviewStatus.FAILED, comments="Need to handle errors")
// Pass the review without comments
    @Review(status=ReviewStatus.PASSED)
*/

}

