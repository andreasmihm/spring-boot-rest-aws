package demo;

public class Greeting {

    private long id;
    private String content;
    private String blah;

	public Greeting() {
		// make jaxb happy
	}
	
    public Greeting(long id, String content, String blah) {
        this.id = id;
        this.content = content;
        this.blah = blah;
    }

    public long getId() {
        return id;
    }

	public void setId(long id){
		this.id = id;
	}

    public String getContent() {
        return content;
    }
	
	public void setContent(String content){
		this.content = content;
	}

	public String getBlah() {
		return blah;
	}

	public void setBlah(String blah) {
		this.blah = blah;
	}
	
	
}