package com.example.practice.web.service;

import com.example.practice.web.bean.Job;
import java.util.List;

/**
 * ドラゴンクエストのサービスクラス
 * @since 2017/10/22
 */
public interface DragonQuestService {

    /**
     * 職業一覧を取得します
     * @return
     */
    List<Job> getJobs();

}
