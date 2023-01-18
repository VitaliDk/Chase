import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class PostsService {

	public PostsService() {
		
	}
	
	public static Response getAllPosts() {
		
		return RestAssured.get("https://jsonplaceholder.typicode.com/posts");
	}
	
	public static Response submitPost(MediaPost mediaPost) {
		
	    return RestAssured.given().body(mediaPost).post("https://jsonplaceholder.typicode.com/posts");
	}
	
}
