@import exercise.dto.users.UsersPage
@param UsersPage page

<html lang="en">
<head>
    <title>Users</title>
</head>
<body>
<form action="/users" method="get">
    <input type="search" name="term" value="${page.getTerm()}"/>
    <input type="submit" value="Search"/>
</form>
    <table class="table table-bordered border-dark">
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
</body>
</html>
