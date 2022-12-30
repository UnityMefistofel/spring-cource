package ru.maxima.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.spring.player.Music;
import ru.maxima.spring.player.MusicGenres;
import ru.maxima.spring.player.MusicPlayer;

import java.util.*;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Map<String,Object> hmMusicBeans = context.getBeansWithAnnotation(MusicGenres.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.setMusic((Music) hmMusicBeans.get("classicalMusic"));
        musicPlayer.setVolume(75);
        musicPlayer.play();
        musicPlayer.setMusic((Music) hmMusicBeans.get("bluesMusic"));
        musicPlayer.setVolume(98);
        musicPlayer.play();
    }
}
