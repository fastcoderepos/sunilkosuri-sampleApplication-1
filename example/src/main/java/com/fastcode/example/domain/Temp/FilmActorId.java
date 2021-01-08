package com.fastcode.example.domain.Temp;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.fastcode.example.domain.Temp.FilmActor
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class FilmActorId implements Serializable {
    static {
        // register persistent class in JVM
        try {
            Class.forName("com.fastcode.example.domain.Temp.FilmActor");
        } catch (Exception e) {}
    }

    public int actorId;
    public int filmId;

    public FilmActorId() {}

    public FilmActorId(String str) {
        fromString(str);
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String toString() {
        return String.valueOf(actorId) + "::" + String.valueOf(filmId);
    }

    public int hashCode() {
        int rs = 17;
        rs = rs * 37 + actorId;
        rs = rs * 37 + filmId;
        return rs;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;

        FilmActorId other = (FilmActorId) obj;
        return (actorId == other.actorId) && (filmId == other.filmId);
    }

    private void fromString(String str) {
        Tokenizer toke = new Tokenizer(str);
        str = toke.nextToken();
        actorId = Integer.parseInt(str);
        str = toke.nextToken();
        filmId = Integer.parseInt(str);
    }

    protected static class Tokenizer {

        private final String str;
        private int last;

        public Tokenizer(String str) {
            this.str = str;
        }

        public String nextToken() {
            int next = str.indexOf("::", last);
            String part;
            if (next == -1) {
                part = str.substring(last);
                last = str.length();
            } else {
                part = str.substring(last, next);
                last = next + 2;
            }
            return part;
        }
    }
}