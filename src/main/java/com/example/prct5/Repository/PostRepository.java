package com.example.prct5.Repository;

import com.example.prct5.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    Post findByNameContaining (String name);
}
