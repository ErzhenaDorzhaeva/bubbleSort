package com.example.bubblesort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BubbleRepository extends CrudRepository<Bubble, Long> {
    
}
