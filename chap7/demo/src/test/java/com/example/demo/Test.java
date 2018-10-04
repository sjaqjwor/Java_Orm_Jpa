package com.example.demo;

import com.example.demo.inherit.Album;
import com.example.demo.inherit.AlbumRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    ParentRepository parentRepository;

    @Autowired
    EmParentRepository emParentRepository;

    @org.junit.Test
    public void saveAndFind() throws Exception {

        Album album = new Album();
        album.setArtist("kyeongrok");

        albumRepository.save(album);

        Optional<Album> album1 = albumRepository.findById(new Long(1));
    }
    @org.junit.Test
    public void saveParent() throws Exception {

       Parent parent = new Parent();

       parent.setId("my");
       parent.setId2("my2");
       parent.setName("se");

       parentRepository.save(parent);
    }

    @org.junit.Test
    public void saveEmParent() throws Exception {

       EmParent emParent = new EmParent();
       EmParentId emParentId = new EmParentId("my","my2");
       emParent.setParentId(emParentId);

       emParentRepository.save(emParent);
    }
}
