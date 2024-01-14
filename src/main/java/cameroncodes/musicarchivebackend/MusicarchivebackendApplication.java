package cameroncodes.musicarchivebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cameroncodes.musicarchivebackend.services.StorageService;



@SpringBootApplication
public class MusicarchivebackendApplication {

	@Autowired
	private static StorageService storageService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MusicarchivebackendApplication.class, args);

		StorageService storageService = context.getBean(StorageService.class);

		System.out.println(storageService.getSongFileNames());
	}

}
