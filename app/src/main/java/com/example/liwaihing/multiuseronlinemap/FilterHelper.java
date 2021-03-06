package com.example.liwaihing.multiuseronlinemap;

/**
 * Created by liwaihing on 18/2/2016.
 */
public class FilterHelper {

    private static final float ALPHA = 0.15f;

    protected FilterHelper(){}

    protected static float[] lowPass(float[] input, float[] output){
        if (output == null)
            return input;
        for (int i=0; i<input.length; i++){
            output[i] = output[i] + ALPHA * (input[i] - output[i]);
            //output[i] = (1-ALPHA)*output[i] + ALPHA*input[i];
        }
        return output;
    }
}
