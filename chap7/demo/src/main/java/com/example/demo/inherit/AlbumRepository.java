package com.example.demo.inherit;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface AlbumRepository  extends JpaRepository<Album, Long> {
}
