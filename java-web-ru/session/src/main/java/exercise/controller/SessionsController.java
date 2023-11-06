package exercise.controller;

import java.util.Collections;

import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.repository.UsersRepository;

import static exercise.util.Security.encrypt;

import exercise.util.NamedRoutes;
import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import org.checkerframework.checker.units.qual.C;

public class SessionsController {

    // BEGIN
    public static void build(Context ctx) {
        var page = new LoginPage(null, null);
        ctx.render("build.jte", Collections.singletonMap("page", page));
    }

    public static void index(Context ctx) {
        var page = new MainPage(ctx.sessionAttribute("currentUser"));
        ctx.render("index.jte", Collections.singletonMap("page", page));
    }

    public static void create(Context ctx) {
        try {
            var name = ctx.formParamAsClass("name", String.class)
                    .check(UsersRepository::existsByName, "Wrong name")
                    .get();
            var user = UsersRepository.findByName(name);
            var password = ctx.formParamAsClass("password", String.class)
                    .check(v -> encrypt(v).hashCode() == user.getPassword().hashCode(), "Wrong password")
                    .get();
            ctx.sessionAttribute("currentUser", name);
            ctx.redirect(NamedRoutes.rootPath());
        } catch (ValidationException e) {
            var user = ctx.formParam("name");
            var page = new LoginPage(user, "Wrong username or password");
            ctx.render("build.jte", Collections.singletonMap("page", page));
        }
    }

    public static void destroy(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect(NamedRoutes.rootPath());
    }
    // END
}
