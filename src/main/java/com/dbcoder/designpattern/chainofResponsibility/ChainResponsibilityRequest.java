package com.dbcoder.designpattern.chainofResponsibility;

import lombok.Data;

/**
* @Description:
* @author: bo.dong
* @Date: 2018-10-18 13:44:16
*/
@Data
public class ChainResponsibilityRequest {
    /**
     * 调用职责连的方法类型
     */
    private Integer methodType;

}
