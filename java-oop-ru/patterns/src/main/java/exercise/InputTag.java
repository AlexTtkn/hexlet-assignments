package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private String tag;
    private String tagInterface;

    public InputTag(String tag, String tagInterface) {
        this.tag = tag;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        return String.format("<input type=\"%s\" value=\"%s\">", tag, tagInterface);
    }
}
// END
