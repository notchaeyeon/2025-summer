package ch09;

import java.util.Arrays;  
import java.util.Random;

public class SimpleLotto {
    public static void main(String[] args) {
    	Random rand = new Random();
        int[] lottoNumArr = {0,0,0,0,0,0,0};  
        
        
        for(int i = 0; i < 7; i++) {       		
        	lottoNumArr[i] = rand.nextInt(46)+1;
        	for(int j = 0; j < i; j++) {
        		if(lottoNumArr[i] == lottoNumArr[j]) i--;
        	}
        }
        
        String lottoNumStr = Arrays.toString(lottoNumArr);  

        System.out.printf("자동 생성 로또 번호: %s", lottoNumStr);
    }
}


/*
자동 생성 로또 번호: [34, 25, 35, 6, 4, 5, 2]
자동 생성 로또 번호: [6, 11, 5, 41, 9, 42, 13]
자동 생성 로또 번호: [24, 4, 34, 17, 29, 9, 5]
자동 생성 로또 번호: [29, 26, 19, 41, 22, 23, 3]
자동 생성 로또 번호: [45, 36, 31, 7, 30, 33, 25]
자동 생성 로또 번호: [26, 40, 2, 6, 43, 36, 14]
자동 생성 로또 번호: [19, 26, 14, 40, 13, 36, 35]
자동 생성 로또 번호: [29, 41, 44, 13, 35, 34, 26]
*/