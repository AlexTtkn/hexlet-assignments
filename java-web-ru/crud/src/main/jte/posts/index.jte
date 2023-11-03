@import exercise.dto.posts.PostsPage
@import exercise.util.NamedRoutes
@param PostsPage postPage

@template.layout.page(
content = @`
    @for(var post: postPage.getPosts())
        <a href="${NamedRoutes.postPath(post.getId())}">${post.getName()} <br> </a>
    @endfor
    <a href="${NamedRoutes.postsPath()}?page=${postPage.getPage() - 1}">Previous page</a>
    <a href="${NamedRoutes.postsPath()}?page=${postPage.getPage() + 1}">Next page</a>

`
)
