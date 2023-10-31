@import exercise.dto.users.UserPage
@param UserPage userPage

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Hexlet</title>
    </head>
    <body>
        <h1>User</h1>
    <p>ID - ${userPage.getUser().getId()}</p>
    <p>Name - ${userPage.getUser().getFirstName()} ${userPage.getUser().getLastName()}</p>
    <p>Email - ${userPage.getUser().getEmail()}</p>
    </body>
</html>