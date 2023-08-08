package exercise;

import java.util.Map;
import java.util.List;


// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String getBody() {
        return body;
    }

    public List<Tag> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName());
        for (Map.Entry<String, String> entry : getAttributes().entrySet()) {
            sb.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        sb.append(">");
        if (!body.isEmpty()) {
            sb.append(body);
        }
        for (Tag child : children) {
            sb.append(child.toString());
        }
        sb.append("</").append(getName()).append(">");
        return sb.toString();
    }
}
// END
