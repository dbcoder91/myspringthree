package com.dbcoder.string;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dbcoder.dto.CatSub;

public class TestContantsString {
    public static void main(String[] args) {
        String a = "{\"detailList\":[{\"detailSharingNo\":\"254945\",\"sharingAmount\":0.00,\"sharingFid\":\"100102011001114026\",\"sharingMode\":0},{\"detailSharingNo\":\"266045\",\"sharingAmount\":0.00,\"sharingFid\":\"100102011001114026\",\"sharingMode\":0}],\"tradeFid\":\"100102011001255040\",\"tradeId\":\"409820190223000000000093\"}";
        if (a.indexOf("\"sharingAmount\":0.00") != -1) {
            System.out.println();
        }
        System.out.println();
    }
}
