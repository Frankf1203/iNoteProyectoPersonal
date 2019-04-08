package com.example.inote.model;

public class note {
    private String notetext;
    private long notedate;

    public note(String notetext, long notedate) {
        this.notetext = notetext;
        this.notedate = notedate;
    }

    public String getNotetext() {
        return notetext;
    }

    public void setNotetext(String notetext) {
        this.notetext = notetext;
    }

    public long getNotedate() {
        return notedate;
    }

    public void setNotedate(long notedate) {
        this.notedate = notedate;
    }
}
