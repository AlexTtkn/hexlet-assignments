@import exercise.dto.users.UsersPage
@param UsersPage usersPage

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Hexlet</title>
    </head>
    <body>
        <h1>Users</h1>
    <table>
        <thead>
        <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        </tr>
        </thead>
        @for(var user: usersPage.getUsers())
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getFirstName()} ${user.getLastName()}</td>
                <td><a href="/users/${user.getId()}">${user.getEmail()}</a></td>
            </tr>
        @endfor
    </table>
    </body>
</html>

