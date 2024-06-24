package com.kristina.cats;

import com.kristina.common.StatisticParent;
import com.kristina.common.utils.MSP;

public class CatActivity extends StatisticParent {


    @Override
    protected String getData() {
        String numOfPurring = String.valueOf(MSP.getInstance().getString("COUNT", "1"));
        String purrPurpose = String.valueOf(MSP.getInstance().getString("PURPOSE","no purpose"));
        StringBuffer buffer = new StringBuffer();
        buffer.append("You cuddled "+ numOfPurring + " times");
        buffer.append("\n\n");
        buffer.append("Your mission is:\n" + purrPurpose);
        String result = buffer.toString();
        return result;
    }
}