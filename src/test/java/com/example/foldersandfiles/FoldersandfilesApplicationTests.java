package com.example.foldersandfiles;

import com.example.foldersandfiles.models.File;
import com.example.foldersandfiles.models.Folder;
import com.example.foldersandfiles.models.Person;
import com.example.foldersandfiles.repositories.FileRepository;
import com.example.foldersandfiles.repositories.FolderRepository;
import com.example.foldersandfiles.repositories.PeopleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersandfilesApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	PeopleRepository peopleRepository;

	@Test
	void contextLoads() {
	}


}
