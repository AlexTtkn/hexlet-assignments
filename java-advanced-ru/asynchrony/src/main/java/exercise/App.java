package exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

class App {

    // BEGIN
    public static Path parse(String string) {
        return Paths.get(string).toAbsolutePath().normalize();
    }

    public static CompletableFuture<String> unionFiles(String file1, String file2, String resultFile) {
        var inputPath1 = parse(file1);
        var futureInput1 = CompletableFuture.supplyAsync(() -> {
            var inputContent = "";
            try {
                inputContent = Files.readString(inputPath1);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            return inputContent;
        }).exceptionally(ex -> {
            System.out.println("ERROR: " + ex.getMessage());
            return "Something wrong.";
        });

        var inputPath2 = parse(file2);
        var futureInput2 = CompletableFuture.supplyAsync(() -> {
            var inputContent = "";
            try {
                inputContent = Files.readString(inputPath2);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            return inputContent;
        }).exceptionally(ex -> {
            System.out.println("ERROR: " + ex.getMessage());
            return "Something wrong";
        });

        var outputPath = parse(resultFile);
        var futureOutput = futureInput1.thenCombine(futureInput2, (input1, input2) -> {
            var result = input1 + input2;

            try {
                Files.writeString(outputPath, result, StandardOpenOption.CREATE);
            } catch (IOException ex) {
                throw new RuntimeException();
            }

            return "Work";
        });

        return futureOutput;
    }

    public static CompletableFuture<Long> getDirectorySize(String dir) {
        return CompletableFuture.supplyAsync(() -> {

            var dirPath = parse(dir);
            var result = 0L;

            try {
                result = Files.list(dirPath)
                        .map(Path::toFile)
                        .filter(file -> !file.isDirectory())
                        .map(File::length)
                        .reduce(0L, Long::sum);
            } catch (IOException ex) {
                throw new RuntimeException();
            }

            return result;
        });
    }

    // END

    public static void main(String[] args) throws Exception {
        // BEGIN
        var futureOutput = unionFiles("src/main/resources/file1.txt",
                "src/main/resources/file2.txt",
                "src/main/resources/dest.txt");
        System.out.println(futureOutput.get());
        // END
    }
}

