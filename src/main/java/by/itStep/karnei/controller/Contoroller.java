package by.itStep.karnei.controller;

import by.itStep.karnei.model.Teachers;
import by.itStep.karnei.repo.InterfaceTeachersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Contoroller {

        @Autowired
        InterfaceTeachersRepo repo;

        @PostMapping("/teachers")
        public Integer create(@RequestBody Teachers teachers) {
            return repo.save(teachers);
        }

        @GetMapping("/teachers/{id}")
        public Teachers get(@PathVariable Integer id) {
            return repo.getById(id);
        }

        @DeleteMapping("/teachers/{id}")
        public void delete(@PathVariable Integer id) {
            repo.delete(id);
        }

    }
