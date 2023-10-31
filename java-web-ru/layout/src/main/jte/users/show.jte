@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
    <head>
        <title>List of users</title>
    </head>
    <body>
    <h1>User</h1>
    <p>ID - ${page.getUser().getId()}</p>
    <p>Name - ${page.getUser().getFirstName()} ${page.getUser().getLastName()}</p>
    <p>Email - ${page.getUser().getEmail()}</p>
    </body>

`,
footer = @`
    <p>Thanks for visiting our website!</p>
`
)
