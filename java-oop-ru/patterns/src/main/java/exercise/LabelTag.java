package exercise;

// BEGIN
public class LabelTag  implements TagInterface {
    private String type;
    private TagInterface value;

    public LabelTag(String type, TagInterface value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        return String.format("<label>%s%s</label>", type, value.render());
    }
}
// END
