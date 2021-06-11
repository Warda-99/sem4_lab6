package com.example.demo.Controller;

import com.example.demo.Importance;
import com.example.demo.Model.Notes;
import com.example.demo.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

    @Autowired
    private NotesService notesService;


    @GetMapping("/")
    public String homePahe(Model model) {
        model.addAttribute("listNotes", notesService.getAllNotes());    // Wyświetlnia rekordów bazy
        Notes notes = new Notes();
        model.addAttribute("notes", notes);
        model.addAttribute("importance", Importance.values());          // Wartosci enum importance
        return "hello";
    }

    // Zapis i powrót na strone glowna
    @PostMapping("/saveNotes")
    public String saveNotes(@ModelAttribute("notes") Notes notes) {
        notesService.saveNotes(notes);
        return "redirect:/";
    }

}
