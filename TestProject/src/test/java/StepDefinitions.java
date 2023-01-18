import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ResponseBody;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import java.util.List;


public class StepDefinitions {
	
	private Context context;
	
	public StepDefinitions(Context _context) {
		context = _context;
	}
	
	@When("I attempt to retrieve posts")
	public void i_attempt_to_retrieve_posts() {
		
		context.response = PostsService.getAllPosts();
		
	}
	
	@When("I attempt to submit a post")
	public void i_attempt_to_submit_a_post() {
		
		MediaPost mediaPost = new MediaPost(1,"222","3","4");
		context.response = PostsService.submitPost(mediaPost);
	}
	
	@Then("I should see a successful 200 response")
	public void i_should_see_a_successful_200_response() {
		context.response.then().statusCode(200).log();
	}
	
	@Then("I should see a list of posts returned in the response")
	public void i_should_see_a_list_of_posts_returned_in_the_response() {
		@SuppressWarnings("rawtypes")
		ResponseBody body = context.response.getBody();
		
		List<MediaPost> mediaPosts = body.jsonPath().getList(".", MediaPost.class);
		
		assertTrue(mediaPosts.size() > 1);
	}
	
	@Then("I should see a successful 201 response")
	public void i_should_see_a_successful_201_response() {
		context.response.then().statusCode(201).log();
	}
	
	@Then("I should see the id of the new post in the response")
	public void i_should_see_the_id_of_the_new_post_in_the_response() {
		context.response.then().body("id", instanceOf(Integer.TYPE));
	}

}
