package cameroncodes.musicarchivebackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Song {

    @Id
    private String id; //Unique identifier for each song

    private String fileName; //MP3 filename for each song

    private String title; //Title of song
    private String artist; //Artist of song
    private boolean isFavorited; //Marks if the song is favorited or not

    

}
