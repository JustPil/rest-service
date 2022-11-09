package justpil.restservice;

public class Greeting {
    private final long ID;
    private final String CONTENT;

    public Greeting(long i, String c) {
        ID = i;
        CONTENT = c;
    }

    public long getId() {
        return ID;
    }

    public String getContent() {
        return CONTENT;
    }
}
