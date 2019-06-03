package com.sss.interfaces;

import java.util.List;
import java.util.Map;

public interface IESService {
    // 表名, 字段名, 模糊查询的值是几
    // 返回的是所有字段形成的list_map, 先转json就提一下要求
    // TODO: 目前的所有查询都是在paper表上, 明(今)天实现其他表
    // count是返回值的最多个数, 我定义是 <100 则 =100
    List<Map<String, Object>> FuzzyQueryAbstract(String name, String index, String info, int count);
}
