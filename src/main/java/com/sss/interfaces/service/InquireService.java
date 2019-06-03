package com.sss.interfaces.service;
import com.sss.interfaces.hmodel.*;

public interface InquireService {
    /***
     * 请注意Tobeexpert Buyres  有一个字段是message，用string表示
     * 实为json字符串，请前端解析后再使用，关于json的格式内容，也可由前端自行决定
     * 后端只负责传，有特殊需求请@后端
     */
    /***
     * 根据id查找数据库中对应的用户
     * @param id 用户的id
     * @return 返回一个User的对象，如果没查到则为NULL
     */
    User getUserInfo(int id);

    /***
     * 根据用户账号查找数据库中对应的用户
     * @param name 用户的账号
     * @return 返回一个User的对象，如果没查到则为NULL
     */
    User getUserInfo(String name);

    /***
     * 根据专家id查找数据库中对应的专家
     * @param id 专家id
     * @return 返回一个Expert的对象，如果没查到则为NULL
     */
    Expert getExperetInfo(int id);

    /***
     * 根据专利id查找数据库中对应的专利
     * @param id 专利的id
     * @return 返回一个Paper的对象，如果没查到则为NULL
     */
    Paper getPaperInfo(int id);

    /***
     * 根据专利id查找数据库中对应的专利
     * @param id 专利id
     * @return 返回一个Patent的对象，如果没查到则为NULL
     */
    Patent getPatentInfo(int id);

    /***
     * 根据动态id查找数据库中对应的动态
     * @param id 动态id
     * @return 返回一个Action的对象，如果没查到则为NULL
     */
    Action getActionInfo(int id);

}
