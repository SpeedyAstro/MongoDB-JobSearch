package in.astro.controller;

import in.astro.model.Post;
import in.astro.repo.ISearchRepo;
import in.astro.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/job")
public class PostController {
    @Autowired
    private IJobService service;



    @GetMapping("/test")
    public ResponseEntity<String> redirect(){
        return new ResponseEntity<String>("message", HttpStatus.OK);
    }

    @GetMapping("/posts")
    public ResponseEntity<?> fetchAllPost(){
        List<Post> posts = service.fetchAllPosts();
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addPost(@RequestBody Post post){
        return new ResponseEntity<>(service.addPost(post),HttpStatus.OK);
    }

    @GetMapping("/search/{text}")
    public ResponseEntity<?> searchPost(@PathVariable String text){
        return new ResponseEntity<>(service.findByText(text),HttpStatus.OK);
    }
}
