package com.example.practice.web.service;

import com.example.practice.web.bean.Job;
import com.example.practice.web.entity.JobEntity;
import com.example.practice.web.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * {@link DragonQuestService}の実装クラス
 * @since 2017/10/22
 */
@Service
public class DragonQuestServiceImpl implements DragonQuestService {

    @Autowired
    private JobRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Job> getJobs() {
        final List<JobEntity> jobEntities = repository.findAll();

        if (jobEntities.isEmpty()) {
            return Collections.emptyList();
        }

        return jobEntities.stream().map(entity -> {
            Job j = new Job();
            j.setId(entity.getJobId());
            j.setName(entity.getJobName());
            return j;
        }).collect(Collectors.toList());
    }

}
