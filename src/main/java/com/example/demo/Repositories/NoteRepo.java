package com.example.demo.Repositories;

import com.example.demo.Model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<Notes, Integer> {

}
