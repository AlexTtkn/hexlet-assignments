package exercise;

import io.javalin.Javalin;

import java.util.List;

import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;

import java.util.Collections;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParam("id");

            User thisUser = USERS.stream()
                    .filter(user -> String.valueOf(user.getId()).equals(id))
                    .findFirst()
                    .orElse(null);

            if (thisUser == null) {
                throw new NotFoundResponse("User not found. Try another ID");
            }

            var userPage = new UserPage(thisUser);
            ctx.render("users/show.jte", Collections.singletonMap("userPage", userPage));
        });

        app.get("/users", ctx -> {
            var usersPage = new UsersPage(USERS);
            ctx.render("users/index.jte", Collections.singletonMap("usersPage", usersPage));
        });
        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
