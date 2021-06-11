package com.example.demo.service;

import com.example.demo.Model.Notes;
import com.example.demo.Repositories.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NoteRepo noteRepo;

    @Override
    public List<Notes> getAllNotes() {
        return noteRepo.findAll();
    }

    @Override
    public void saveNotes(Notes notes) {
        this.noteRepo.save(notes);
    }
}
