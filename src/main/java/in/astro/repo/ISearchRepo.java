package in.astro.repo;

import in.astro.model.Post;

import java.util.List;

public interface ISearchRepo {
    public List<Post> findByText(String text);
}
