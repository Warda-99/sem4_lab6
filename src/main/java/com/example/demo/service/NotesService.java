package com.example.demo.service;

import com.example.demo.Model.Notes;

import java.util.List;

public interface NotesService {
    List<Notes> getAllNotes();
    void saveNotes(Notes notes);
}
