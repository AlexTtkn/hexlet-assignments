@import exercise.dto.posts.PostPage
@param PostPage postPage

@template.layout.page(
content = @`
    <html lang="en">
    <div>
        <h2>${postPage.getPost().getName()}</h2>
    </div>
    <div>
        <p>${postPage.getPost().getBody()}</p>
    </div>
    </html>
`
)
