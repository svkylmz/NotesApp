package com.svkylmz.notesapp.feature_note.domain.use_case

import com.svkylmz.notesapp.feature_note.domain.model.Note
import com.svkylmz.notesapp.feature_note.domain.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}