package ru.maxima.spring.player;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MusicPlayer {

    private String name;
    private int volume;
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Now playing: " + music.getSong());
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume changed to "+volume);
    }
}
