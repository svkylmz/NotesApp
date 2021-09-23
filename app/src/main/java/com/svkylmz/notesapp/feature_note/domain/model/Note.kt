package com.svkylmz.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.svkylmz.notesapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteBackgroundColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
