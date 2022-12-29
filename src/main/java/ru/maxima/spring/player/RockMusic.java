package ru.maxima.spring.player;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@MusicGenres
@Primary
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "AC/DC - HighWay To Hell";
    }
}
