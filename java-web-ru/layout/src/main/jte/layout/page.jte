@import gg.jte.Content
@param Content content
@param Content footer = null

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Hexlet Users</title>
</head>
<body>
<div>
    <p>
        <a href="/">Home</a>
        <a href="/users">Users</a>
    </p>
</div>
    ${footer}
    ${content}
</body>
</html>
