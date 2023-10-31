@import exercise.dto.users.UsersPage
@param UsersPage page


@template.layout.page(
content = @`
    <h1>List of users</h1>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        @for(var user : page.getUsers())
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getFirstName()} ${user.getLastName()}</td>
                <td>${user.getEmail()}</td>
            </tr>
        @endfor
        </tbody>
    </table>
`,
footer = @`
    <p>Thanks for visiting our website!</p>
`
)
