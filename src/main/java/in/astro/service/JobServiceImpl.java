package in.astro.service;

import in.astro.model.Post;
import in.astro.repo.ISearchRepo;
import in.astro.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements IJobService{

    @Autowired
    private PostRepo repo;
    @Autowired
    private ISearchRepo searchRepo;
    @Override
    public List<Post> fetchAllPosts() {
        return repo.findAll();
    }

    @Override
    public String addPost(Post post) {
        Integer id = repo.save(post).getId();
        return "Post Added With ID ::"+id;
    }

    @Override
    public List<Post> findByText(String text) {
        return searchRepo.findByText(text);
    }
}
