package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int storageSize = 10;
        int itemNumbers = 30;

        main.starter(storageSize, itemNumbers);
    }
    int cColl= 4;
    int pColl = 5;
    int[] carray ={5,7,8,10};
    int[] parray ={5,7,8,6,4};

    private void starter(int storageSize, int itemNumbers) {
        int i=0;
        Manager manager = new Manager(storageSize);
        for ( i=0;i<pColl;i++){
            new Producer(parray[i],manager,i);
        }
        for ( i=0;i<cColl;i++){
            new Consumer(carray[i],manager,i);
        }
    }
}
