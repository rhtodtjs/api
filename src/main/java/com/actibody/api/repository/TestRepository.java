package com.actibody.api.repository;

import com.actibody.api.model.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("testRepository")
public interface TestRepository extends JpaRepository<TestTable,Long> {

    TestTable findByIdx(long idx);
}
