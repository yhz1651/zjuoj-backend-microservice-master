package com.yhz.zjuojbackendjudgeservice.judge;

import com.yhz.zjuojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.yhz.zjuojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.yhz.zjuojbackendjudgeservice.judge.strategy.JudgeContext;
import com.yhz.zjuojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.yhz.zjuojbackendmodel.model.codesandbox.JudgeInfo;
import com.yhz.zjuojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
