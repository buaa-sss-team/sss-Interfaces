package com.sss.interfaces;

import javafx.util.Pair;

import java.util.List;
import java.util.Map;

public interface IESService {
    /***
     * FuzzyQuery 是(整个字段的)模糊查询
     * @param name      表名, 只能是expert, paper, patent 三个之一
     * @param index     字段名, 必须在表里
     * @param info      查询的 information
     * @param count     返回值的最多个数, 我定义是 <100 则 =100
     * @return          所有字段形成的 map
     */
    List<Map<String, Object>> FuzzyQuery(String name, String index, String info, int count);

    /**
     * Query, 最外边的list是and => 里面的list是or
     * 某个字段是否满足任意条件 and 某个字段是否满足任意条件 etc
     * 方式如下:
     * matchQuery: 全文检索
     * fuzzyQuery: 模糊检索
     * rangeQuery: 范围检索(现在只支持数字，完了有需求改一下)
     *      rangeQuery 值是lt, gt, lte, gte四者之一, 保留字段是那个数字 NOT TESTED
     * termQuery : 输入的查询内容是什么，就会按照什么去查询，并不会解析查询内容，也就是啥也不改就查
     * wildcardQuery: 通配符查询，可以使用'*'或者'?'
     * @param name      表名, 只能是expert, paper, patent 三个之一
     * @param limits    List<字段,List<值, <方式, 保留字段>>>
     * @param count     返回值的最多个数, 我定义是 <100 则 =100
     * @return          所有字段形成的 map
     */
    List<Map<String, Object>> Query(String name, List<Pair<String,List<Pair<String,Pair<String,String>>>>> limits, int count);
}
