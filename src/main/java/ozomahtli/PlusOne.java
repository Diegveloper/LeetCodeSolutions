package ozomahtli;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){

    }

    public int[] plusOne(int[] ar) {
        boolean run = true;
        int next = 0;

        int[] d = new int[ar.length + 1];
        for(int i = 0; i < ar.length + 1; i++){
            if(i == 0){
                d[i] = 0;
            }
            else{
                d[i] = ar[i-1];
            }
        }
        int inc = 1;
        boolean skip = false;
        for(int i = d.length-1; i>=0; i-- ){

            if(inc==0) break;
            int val = d[i] + inc--;

            if(val > 9){
                d[i] = 0;
                inc++;
            }
            else{
                d[i] = val;
            }
        }
        if(d[0] == 0){
            return Arrays.copyOfRange(d,  1,  d.length);
        }
        else{
            return d;
        }

    }
}
