package com.example.spravochnik.repos;

import com.example.spravochnik.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
    List<Message> deleteById(Integer id);

}
