package com.devstack.lms.subjectserviceapi.service;

import com.devstack.lms.subjectserviceapi.dto.request.RequestSubjectDto;

import java.util.List;

public interface SubjectService {
    public void createSubject(RequestSubjectDto dto);
    public boolean isListAvailable(List<Long> ids);
}
