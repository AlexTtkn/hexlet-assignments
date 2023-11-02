<form action="/users" method="post">
    <div>
        <label>
            First name
            <input type="text" name="firstName">
        </label>
    </div>
    <div>
        <label>
            Last name
            <input type="text" name="lastName">
        </label>
    </div>
    <div>
        <label>
            Email
            <input type="text" required name="email">
        </label>
    </div>
    <div>
        <label>
            Password
            <input type="text" required name="password">
        </label>
    </div>
    <div>
        <label>
            Password confirmation
            <input type="text" required name="passwordConfirmation">
        </label>
    </div>
    <input type="submit" name="Register">
</form>
