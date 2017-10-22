package com.example.practice.web.service;

import com.example.practice.web.bean.Job;
import com.example.practice.web.entity.JobEntity;
import com.example.practice.web.repository.JobRepository;
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * {@link DragonQuestServiceImpl} のテスト
 * @since 2017/10/22
 */
@RunWith(Enclosed.class)
public class DragonQuestServiceImplTest {

    @RunWith(JMockit.class)
    public static class getJobsのテスト {

        // テスト対象クラス(System Under Test)
        private DragonQuestServiceImpl sut;

        @Mocked
        private JobRepository repository;

        @Before
        public void setUp() {
            sut = new DragonQuestServiceImpl();
            // privateフィールドへの変数格納
            Deencapsulation.setField(sut, "repository", repository);
        }

        @Test
        public void データが空の場合_空のリストを返却する() throws Exception {

            // mockの振る舞いを定義する
            new Expectations(){{
                // 振る舞いを定義したいメソッド
                repository.findAll();
                // 振る舞いの結果
                result = Collections.emptyList();
            }};

            // 実行
            List<Job> jobs = sut.getJobs();

            // 評価
            assertThat(jobs, is(notNullValue()));
            assertThat(jobs.size(), is(0));
        }

        @Test
        public void データが存在する場合_リストを返却する() throws Exception {

            // 返却データの作成
            JobEntity e1 = new JobEntity();
            e1.setJobId(1);
            e1.setJobName("戦士");
            JobEntity e2 = new JobEntity();
            e2.setJobId(2);
            e2.setJobName("僧侶");
            final List<JobEntity> list = Arrays.asList(e1, e2);

            // mockの振る舞いを定義する
            new Expectations(){{
                // 振る舞いを定義したいメソッド
                repository.findAll();
                // 振る舞いの結果
                result = list;
            }};

            // 実行
            List<Job> jobs = sut.getJobs();

            // 評価
            assertThat(jobs, is(notNullValue()));
            assertThat(jobs.size(), is(2));
            Job j1 = jobs.get(0);
            assertThat(j1.getId(), is(1));
            assertThat(j1.getName(), is("戦士"));
            Job j2 = jobs.get(1);
            assertThat(j2.getId(), is(2));
            assertThat(j2.getName(), is("僧侶"));

        }


    }

}
