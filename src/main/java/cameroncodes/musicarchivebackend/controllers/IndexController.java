package cameroncodes.musicarchivebackend.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cameroncodes.musicarchivebackend.services.StorageService;


@Controller
public class IndexController {

    private final StorageService storageService;

    //Injects an instance of storageservice 
    public IndexController(StorageService storageService) {
        this.storageService = storageService;
    }


    @GetMapping
    public String getHomepage(Model model) {

        //MVC - Model, View, Controller
        model.addAttribute("songFileNames", storageService.getSongFileNames()); //Creates a songFileNames attribute and sets it data

        return "index";
    }

    //Grabs file selected from the front-end and sends it to storageService
    @PostMapping
    public String handleFileUpload(@RequestParam("file")MultipartFile file) throws IOException{

        storageService.uploadSong(file);

        return "redirect:/"; //A redirect page that calls the getHomepage method after the file uploads
    }   
    
}
