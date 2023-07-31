package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String str;

    public ReversedSequence(String str) {
        StringBuilder reverse = new StringBuilder(str).reverse();
        this.str = String.valueOf(reverse);
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int i) {
        return str.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return str.substring(i, i1);
    }
}
// END
