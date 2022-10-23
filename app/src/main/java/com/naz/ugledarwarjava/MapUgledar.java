package com.naz.ugledarwarjava;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MapUgledar{
    public TableLayout tableMapUgledar;
   // public Intent intent;
    public int rowIndex=0;
    public int colIndex=0;
    public boolean isHit;


    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public boolean getisHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public MapUgledar(TableLayout tableMapUgledar) {
        this.tableMapUgledar=tableMapUgledar;
    }

    void createMapUgledar() {
        int mapUgledarRows = 64;                // количество строк на карте
        int mapUgledarCollums = 81;             // количество стольцов на карте

        BombHit bombHit=new BombHit();
        bombHit.setBombArray();


        // построение карты
        for (int i = 0; i <mapUgledarRows; i++) {
            TableRow tableRow = new TableRow(tableMapUgledar.getContext());
            tableRow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            // заполнение карты
            for (int j = 0; j < mapUgledarCollums; j++) {
                ImageView imageView0 = new ImageView(tableMapUgledar.getContext());
                ImageView imageViewB = new ImageView(tableMapUgledar.getContext());
                imageView0.setImageResource(R.drawable.kletkafree);
                imageViewB.setImageResource(R.drawable.bombared);
                if(bombHit.getBombArray()[i][j]==1) {
                    tableRow.addView(imageViewB, j);
                    int hitRows = i;
                    int hitColl = j;
                    imageViewB.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //System.out.println(hitRows +"---"+hitColl);
                            rowIndex=hitRows;
                            colIndex=hitColl;
                            isHit=true;

                            //intent.putExtra("rowindex", rowIndex);
                           // intent.putExtra("colindex", colIndex);

                        }
                    });
                }else {tableRow.addView(imageView0, j);
                    int hitRows = i;
                    int hitColl= j ;
                    imageView0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //System.out.println(hitRows+"---"+hitColl);
                        rowIndex=hitRows;
                        colIndex=hitColl;
                        isHit=false;
                    }
                });}
            }
            tableMapUgledar.addView(tableRow, i);
            System.out.println(rowIndex);
            System.out.println(colIndex);
        }

    }


}
