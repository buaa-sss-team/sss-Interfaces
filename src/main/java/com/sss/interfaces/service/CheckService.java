package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.*;

import java.util.List;

public interface CheckService {
    /***
     * 请注意Tobeexpert Buyres 有一个字段是message，用string表示
     * 实为json字符串，请自行解析
     */
    /***
     * 管理员审核专家入驻的申请信息
     * @param status 0代表未审核，1代表审核过了的，其实可以有更多状态，完全取决于前端怎么想
     * @return 返回所有关于专家入驻申请且符合条件的数据，请注意有可能是0条
     */
    List<Tobeexpert> checkTobeexpert(int status);
    /***
     * 管理员审核资源交易的信息，如专利转让，购买论文什么的
     * @param status 0代表未审核，1代表审核过了的
     * @return 成功返回0，失败返回1
     */
    List<Buyres> checkBuyRes(int status);
}
