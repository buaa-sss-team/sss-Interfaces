package com.sss.interfaces;

import java.util.List;
import java.util.Map;

public interface IESService {
    /***
     *
     * @param name  表名, 只能是expert, paper, patent 三个之一
     * @param index 字段名, 必须在表里
     * @param info  查询的 information
     * @param count 返回值的最多个数, 我定义是 <100 则 =100
     * @return 所有字段形成的 map
     */
    List<Map<String, Object>> FuzzyQueryAbstract(String name, String index, String info, int count);
}
