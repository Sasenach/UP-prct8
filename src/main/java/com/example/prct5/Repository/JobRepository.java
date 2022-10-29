package com.example.prct5.Repository;

import com.example.prct5.Models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository  extends CrudRepository<Job, Long> {
    Job findByNameContaining(String name);
}
