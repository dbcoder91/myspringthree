package com.dbcoder.designpattern.chainofresponsibilitydemo;

/**
 * 接口描述：处理请求
 *
 * @author lzy
 *
 */
public interface Ratify {
    /**
    * @title 处理请求
    * @author bo.dong
    * @date 2018/10/18 14:49
    * @useScene
    * @parameterExample
    * @returnExample
    * @param
    * @return
    */
    Result deal(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Result proceed(Request request);
    }
}

