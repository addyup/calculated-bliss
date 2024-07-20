package com.nice.cool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nice.cool.model.FileDB;


@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
