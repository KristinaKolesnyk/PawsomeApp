package com.kristina.pawsomeduo;

import com.kristina.common.StatisticParent;
import com.kristina.common.utils.MSP;

public class DogActivity extends StatisticParent {


    @Override
    protected String getData() {
        String numberOfCuddles = String.valueOf(MSP.getInstance().getString("COUNT", "1"));
        String woofPurpose = String.valueOf(MSP.getInstance().getString("PURPOSE","no purpose"));
        StringBuffer buffer = new StringBuffer();
        buffer.append("You cuddled "+ numberOfCuddles + " times");
        buffer.append("\n\n");
        buffer.append("Your mission is:\n" + woofPurpose);
        String result = buffer.toString();
        return result;
    }
}