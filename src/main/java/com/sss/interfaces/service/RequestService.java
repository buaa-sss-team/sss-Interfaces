package com.sss.interfaces.service;
import com.sss.interfaces.hmodel.*;
public interface RequestService {
    /***
     * 请注意Tobeexpert Buyres  有一个字段是message，用string表示
     * 实为json字符串，请前端解析后再使用，关于json的格式内容，也可由前端自行决定
     * 后端只负责传，有特殊需求请@后端
     */
    /**
     * 用于用户提交关于申请成为专家的表单或请求的服务
     * @param Tobeexpert
     * @return 成功返回0，失败返回1
     */
    int reqForExpert (Tobeexpert Tobeexpert);

    /**
     * 用于用户提交关于购买科技成果表单或请求的服务
     * @param buyRes 接受一个Buyres对象
     * @return 成功返回0，失败返回1
     */
    int buyResource (Buyres buyRes);
}
