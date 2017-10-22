package com.example.practice.web.repository;

import com.example.practice.web.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 職業データのリポジトリクラス
 * @since 2017/10/22
 */
@Repository
public interface JobRepository extends JpaRepository<JobEntity, Integer> {
}
