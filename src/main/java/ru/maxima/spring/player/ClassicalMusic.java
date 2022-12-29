package ru.maxima.spring.player;

import org.springframework.stereotype.Component;

@Component
@MusicGenres
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Antonio Vivaldi - Spring";
    }
}
