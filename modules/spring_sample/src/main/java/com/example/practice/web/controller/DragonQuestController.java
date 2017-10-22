package com.example.practice.web.controller;

import com.example.practice.web.bean.Job;
import com.example.practice.web.service.DragonQuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ドラゴンクエストのコントローラクラス
 * @since 2017/10/22
 */
@RestController
@RequestMapping("/draque")
public class DragonQuestController {

    @Autowired
    private DragonQuestService dragonQuestService;

    /**
     * 転職可能な職業の一覧を取得します
     * @return
     */
    @RequestMapping(path = "/jobs", method = RequestMethod.GET)
    public List<Job> jobs() {
        return dragonQuestService.getJobs();
    }

}
