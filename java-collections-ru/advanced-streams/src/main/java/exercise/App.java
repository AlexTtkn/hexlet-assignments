package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        return Arrays.stream(config.split("\n"))
                .filter(line -> line.contains("environment="))
                .map(line -> line.substring(line.indexOf("=") + 1))
                .flatMap(env -> Arrays.stream(env.split(",")))
                .filter(env -> env.contains("X_FORWARDED_"))
                .map(env -> env.replaceAll("X_FORWARDED_", ""))
                .map(env -> env.replaceAll("\"", ""))
                .collect(Collectors.joining(","));
    }
}
//END
