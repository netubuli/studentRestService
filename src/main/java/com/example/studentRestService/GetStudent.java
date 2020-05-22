package com.example.studentRestService;

import org.springframework.data.repository.CrudRepository;

public interface GetStudent extends CrudRepository<Student, Integer> {
}
