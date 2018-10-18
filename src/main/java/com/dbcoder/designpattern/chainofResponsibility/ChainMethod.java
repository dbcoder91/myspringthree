package com.dbcoder.designpattern.chainofResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChainMethod {

    public void execute(ChainResponsibilityRequest request) {
        List<Ihanlder> ihanlders=new ArrayList<>();
        ihanlders.add(new ResponsibilityMothod1());
        ihanlders.add(new ResponsibilityMothod2());

        for (Ihanlder ihanlder:ihanlders){
            ChainResponsibilityResponse response= ihanlder.doHander(request);
            System.out.println(response.getText());
        }
    }
}
