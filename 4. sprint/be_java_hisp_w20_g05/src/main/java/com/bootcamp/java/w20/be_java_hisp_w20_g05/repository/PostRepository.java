package com.bootcamp.java.w20.be_java_hisp_w20_g05.repository;

import com.bootcamp.java.w20.be_java_hisp_w20_g05.model.Post;
import com.bootcamp.java.w20.be_java_hisp_w20_g05.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class PostRepository implements IRepository<Post>{
    private Set<Post> posts;

    @Override
    public boolean contains(Post post) {
        return posts.contains(post);
    }
    @Override
    public boolean add(Post post) {
        if (contains(post)) return false;
        return posts.add(post);
    }

    @Override
    public Set<Post> filterBy(String productName) {
        return posts.stream().filter(p -> p.getProduct().getName().toLowerCase()
                        .matches("^.*" + productName.toLowerCase() + ".*$"))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Post> getAll() {
        return this.posts;
    }

    public boolean addAll(List<Post> posts){return posts.addAll(posts);
    }
}
