package exercise.util;

import exercise.controller.PostsController;

public class NamedRoutes {

    public static String rootPath() {
        return "/";
    }

    public static String postsPath() {
        return "/posts";
    }

    public static String buildPostPath() {
        return "/posts/build";
    }

    public static String postPath(Long id) {
        return postPath(String.valueOf(id));
    }

    public static String postPath(String id) {
        return "/posts/" + id;
    }

    // BEGIN
    public static String editPath(Long id) {
        return editPath(String.valueOf(id));
    }
    public static String editPath(String id) {
        return postsPath() + "/" + id + "/edit";
    }
    // END
}
