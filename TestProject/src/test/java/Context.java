import io.restassured.response.Response;

public class Context {

	public Response response;
	
	public Context() {
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
}
