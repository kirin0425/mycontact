package com.study.mycontact.service;

import com.study.mycontact.domain.Block;
import com.study.mycontact.domain.Person;
import com.study.mycontact.repository.BlockRepository;
import com.study.mycontact.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BlockRepository blockRepository;

    public List<Person> getPersonExcludeBlocks() {
        List<Person> people = personRepository.findAll();
        List<Block> blocks = blockRepository.findAll();
        List<String> blockNames = blocks.stream().map(Block::getName).collect(Collectors.toList());

        return people.stream().filter(person -> !blockNames.contains(person.getName())).collect(Collectors.toList());
    }
}
