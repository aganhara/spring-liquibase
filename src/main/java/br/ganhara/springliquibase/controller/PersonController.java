package br.ganhara.springliquibase.controller;

import br.ganhara.springliquibase.model.Person;
import br.ganhara.springliquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public ResponseEntity<Iterable<Person>> all(Pageable pageable) {
        return new ResponseEntity<>(personRepository.findAll(pageable), HttpStatus.OK);
    }
}
