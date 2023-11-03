@import exercise.dto.posts.EditPostPage
@param EditPostPage page

@template.layout.page(
content = @`
    @if(page.getErrors() != null)
        <ul>
            @for(var validator : page.getErrors().values())
                @for(var error : validator)
                    <li>${error.getMessage()}</li>
                @endfor
            @endfor
        </ul>
    @endif
    <form action="/posts" method="post">
        <div>
            <label>
                Name
                <input type="text" name="name" value="${page.getName()}">
            </label>
        </div>
        <div>
            <label>
                Content
            </label>
            <textarea type="text" name="content">${page.getBody()}</textarea>
        </div>
        <input type="submit" value="Save"/>
    </form>
`
)
