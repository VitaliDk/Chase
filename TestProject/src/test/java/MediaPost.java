
public class MediaPost {

	public int userId;
	public String id;
	public String title;
	public String body;
	
	public MediaPost() {}
	
	public MediaPost(int userId,String id, String title, String body) {
		
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body ;
		}
	
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
