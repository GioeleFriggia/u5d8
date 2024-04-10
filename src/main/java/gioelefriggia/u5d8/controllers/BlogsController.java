package gioelefriggia.u5d8.controllers;

import gioelefriggia.u5d8.entities.Blogpost;
import gioelefriggia.u5d8.services.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogsController {
    @Autowired
    BlogsService blogsService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Blogpost saveBlog(@RequestBody Blogpost body) {
        return blogsService.save(body);
    }

    @GetMapping("")
    public List<Blogpost> getBlogs() {
        return blogsService.getBlogs();
    }

    @GetMapping("/{blogId}")
    public Blogpost findById(@PathVariable int blogId) {
        return blogsService.findById(blogId);
    }

    @PutMapping("/{blogId}")
    public Blogpost findAndUpdate(@PathVariable int blogId, @RequestBody Blogpost body) {
        return blogsService.findByIdAndUpdate(blogId, body);
    }

    @DeleteMapping("/{blogId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findAndDelete(@PathVariable int blogId) {
        blogsService.findByIdAndDelete(blogId);
    }
}
