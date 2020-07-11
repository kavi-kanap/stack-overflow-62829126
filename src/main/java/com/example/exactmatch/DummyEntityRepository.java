package com.example.exactmatch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DummyEntityRepository extends JpaRepository<DummyEntity, Long> {

    @Query("Select d from DummyEntity d left join d.items i where i in :items " +
            "group by d having count(i) = :itemsSize")
    Page<DummyEntity> findAllByItems(List<String> items, long itemsSize, Pageable pageable);
}
