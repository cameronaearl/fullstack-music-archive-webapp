package cameroncodes.musicarchivebackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cameroncodes.musicarchivebackend.model.Song;

public interface SongRepository extends MongoRepository<Song, String>{

    

}
