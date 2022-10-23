package com.naz.ugledarwarjava;

public class BombHit {
    private int[][] bombArray=new int[64][81];

    public BombHit() {
    }

    public int[][] getBombArray() {
        return bombArray;
    }

    void setBombArray(){
        bombArray[44][30]=1;    //ш30
        bombArray[30][37]=1;    //т32
        bombArray[42][28]=1;    //Шк2
    }
}
