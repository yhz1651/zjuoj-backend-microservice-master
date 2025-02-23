package com.yhz.zjuojbackendjudgeservice.judge.codesandbox;

import com.yhz.zjuojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yhz.zjuojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
