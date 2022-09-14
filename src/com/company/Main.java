package com.company;

public class Main {

    public static void main(String[] args) {

        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int pos=-1,curr=0,total=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            curr+=diff;
            total+=diff;
            if(curr<0){
                curr=0;
                pos=i;
            }
        }
        if(total>=0){
            System.out.println(pos+1);
        }
	     System.out.println("-1");
    }
}
