import java.io.Serializable;

public class Input implements Serializable {
    private String text;
    private String pattern;
    private int start;
    private int finish;

    public Input(String text, String pattern, int s, int f) {
        this.text = text;
        this.pattern = pattern;
        this.start = s;
        this.finish = f;
    }

    public String getText() {
        return text;
    }

    public String getPattern() {
        return pattern;
    }

    public int getStart() {
        return start;
    }

    public int getFinish() {
        return finish;
    }
}
