package com.dbcoder.dto;

import lombok.Data;
import org.aspectj.weaver.ast.Test;

import java.io.Serializable;

@Data
public class ShareModeVO implements TestInterfaceVO , Serializable{
    /**
     * 分账业务方
     */
    private Integer shareProfitBizType;
    /**
     * 分账模式
     */
    private Integer shareMode;

    private String testStr;

    @Override
    public String testStr() {
        return null;
    }
}
