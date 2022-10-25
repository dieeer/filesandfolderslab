package com.example.foldersandfiles.components;

import com.example.foldersandfiles.models.File;
import com.example.foldersandfiles.models.Folder;
import com.example.foldersandfiles.models.Person;
import com.example.foldersandfiles.repositories.FileRepository;
import com.example.foldersandfiles.repositories.FolderRepository;
import com.example.foldersandfiles.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    PeopleRepository peopleRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Folder folder1 = new Folder("my folder");
        folderRepository.save(folder1);

        File file1 = new File("CV", "doc", 10);
        fileRepository.save(file1);

        Person person1 = new Person("user");
        peopleRepository.save(person1);

        folder1.addFile(file1);
        folder1.addPerson(person1);
        folderRepository.save(folder1);

        file1.addFolder(folder1);
        fileRepository.save(file1);

        person1.addFolder(folder1);
        peopleRepository.save(person1);


    }

}
