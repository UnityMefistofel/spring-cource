package ru.maxima.spring.player;

import org.springframework.stereotype.Component;

@Component
@MusicGenres
public class BluesMusic implements Music {
    @Override
    public String getSong() {
        return "Blues Saraceno - The Devil You Know";
    }
}
