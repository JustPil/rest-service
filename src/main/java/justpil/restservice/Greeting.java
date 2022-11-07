package justpil.restservice;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long i, String c) {
        id = i;
        content = c;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
