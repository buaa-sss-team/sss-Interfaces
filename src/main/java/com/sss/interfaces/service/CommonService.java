package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.*;

import java.util.List;

public interface CommonService {
    /***
     * 用户登录方法
     * @param name 用户账号
     * @param pwd 用户密码
     * @return 成功返回0，失败返回1
     */
    int userLogin(String name, String pwd);
    /***
     * 用户注册方法
     * @param user 用户实例，不用填写id，
     * @return 成功返回0，失败返回1
     */
    int userSignIn(User user);

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
    Expert getExpertInfo(int id);

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

    /**
     * 根据User id找到对应的tradeinfo
     * @param id 用户id
     * @return tradeinfo的list集合，没有结果则为NULL
     */
    List<Tradeinfo> getTradeInfo(int id);

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

    /**
     * 用户是1，专家是2，管理员是3
     * @param expert expert对象
     * @return 成功返回0，失败返回1，失败原因有多种，暂不区分
     */
    int addExpert(Expert expert);

    /**
     * 由于底层关系，传入的必须是hmodel中的对象，例如你要删除id为1的User
     * 首先实例化一个 User user = new user()
     * 然后user.setid(1)
     * @param object hmodel中的实例化对象
     * @return 成功返回0，失败返回1
     */
    int delete(Object object);

    /**
     * 由于底层关系，传入的必须是hmodel中的对象，例如你要更新id为1的User
     * 首先实例化一个 User user = new user()
     * 然后user.setid(1)
     * @param object hmodel中的实例化对象
     * @return 成功返回0，失败返回1
     */
    int update(Object object);

    /**
     * 原来这么简单
     * 那我还要业务逻辑层干啥
     * 笑死了
     * @param object hmodel中的实例化对象
     * @return 成功返回0，失败返回1
     */
    int insert(Object object);

    /**
     * 更新专家info
     * @param expert expert对象
     * @return 成功返回0，失败返回1，失败原因有多种，暂不区分
     */
    int updateExpertInfo(Expert expert);

    /**
     * 更新用户info
     * @param user user对象
     * @return 成功返回0，失败返回1
     */
    int updateUserInfo(User user);

    /**
     * 增加一条交易记录，包括提现和购买科技成果
     * 发生在每一次交易成功时
     * @param tradeinfo tradeinfo对象
     * @return 成功返回0，失败返回1
     */
    int addTradeInfo(Tradeinfo tradeinfo);

    /**
     * 获取对应专家id的动态
     * @param id 对应专家id
     * @return List类的Action，可能为空
     */
    List<Action> getActionByUserId(int id);

    /**
     * 增加一条动态
     * @param action action对象
     * @return 成功返回0，失败返回1
     */
    int addAction(Action action);
}
