package com.company.homework_2.task_3;

public class Task3 {
    public static void main(String[] args) {
    int sum=0;
        // i = i * 2, но не забудь добавить 1
     for (int i = 1; i <= 256; i*=2+1){ // i <= 256
         // у тебя будет так 0*0, 1*1, 2*2 -> 0 + 1 + 4, двойку потеряла
         sum+=i;
     }
        System.out.println("Addition: "+sum);

    }
}
