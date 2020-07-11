package com.example.exactmatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Service
public class DummyEntityService {

    @Autowired
    public DummyEntityRepository dummyEntityRepository;

    @PostConstruct
    public void init() {
        dummyEntityRepository.save(new DummyEntity("dummy1", Collections.singletonList("first")));
        dummyEntityRepository.save(new DummyEntity("dummy2", Collections.singletonList("second")));
        dummyEntityRepository.save(new DummyEntity("dummy2", Collections.singletonList("third")));

    }


}
