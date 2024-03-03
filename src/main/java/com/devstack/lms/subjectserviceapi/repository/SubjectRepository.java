package com.devstack.lms.subjectserviceapi.repository;

import com.devstack.lms.subjectserviceapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
