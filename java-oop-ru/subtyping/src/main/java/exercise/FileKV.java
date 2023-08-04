package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filepath;

    public FileKV(String filepath, Map<String, String> initial) {
        this.filepath = filepath;
        initial.forEach(this::set);
    }

    public void set(String key, String value) {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        data.put(key, value);
        Utils.writeFile(filepath, Utils.serialize(data));
    }

    public void unset(String key) {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        data.remove(key);
        Utils.writeFile(filepath, Utils.serialize(data));
    }

    public String get(String key, String defaultValue) {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        String content = Utils.readFile(filepath);
        Map<String, String> data = Utils.unserialize(content);
        return data;
    }
}
// END
