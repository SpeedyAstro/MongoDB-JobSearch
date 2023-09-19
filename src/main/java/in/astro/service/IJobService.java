package in.astro.service;

import in.astro.model.Post;

import java.util.List;

public interface IJobService {
    public List<Post> fetchAllPosts();
    public String addPost(Post post);
    public List<Post> findByText(String text);
}
