@import exercise.dto.LoginPage
@import exercise.util.NamedRoutes
@param LoginPage page

@template.layout.page(
content = @`
@if(page.getError() != null)
    ${page.getError()}
    @endif
    <form action="${NamedRoutes.loginPath()}" method="post">
        <div>
            <label>
                Name
                <input type="text" name="name" required value="${page.getName()}">
            </label>
        </div>
        <div>
            <label>
                Password
                <input type="password" name="password" required>
            </label>
        </div>
        <input type="submit" name="Confirm"/>
    </form>
`
)
