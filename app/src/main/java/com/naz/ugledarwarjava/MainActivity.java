package com.naz.ugledarwarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private int rowIndex;
    //private int colIndex;
    private boolean isHit;
    private TableLayout tableMapUgledar;
    public Intent intent;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableMapUgledar = (TableLayout) findViewById(R.id.tableMapUgledar);
        //MapUgledar mapUgledar=new MapUgledar(tableMapUgledar);
        //mapUgledar.createMapUgledar();
        createMapUgledar();
        //System.out.println("-----");
        //System.out.println(rowIndex);
        //System.out.println(colIndex);
        //System.out.println(isHit);

        //startActivity(intent);

        //DisplayMedia displayMedia=new DisplayMedia(mapUgledar);
        //displayMedia.mediaVisile();


    }
    void createMapUgledar() {
        int mapUgledarRows = 64;                // количество строк на карте
        int mapUgledarCollums = 81;             // количество стольцов на карте


        BombHit bombHit=new BombHit();
        bombHit.setBombArray();


        // построение карты
        for (int i = 0; i <mapUgledarRows; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            // заполнение карты
            for (int j = 0; j < mapUgledarCollums; j++) {
                ImageView imageView0 = new ImageView(this);
                ImageView imageViewB = new ImageView(this);
                imageView0.setImageResource(R.drawable.kletkafree);
                imageViewB.setImageResource(R.drawable.bombared);
                if(bombHit.getBombArray()[i][j]==1) {
                    tableRow.addView(imageViewB, j);
                    int rowIndex = i;
                    int colIndex = j;
                    imageViewB.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            isHit=true;
                            visibleMedia(rowIndex, colIndex);
                        }
                    });
                }else tableRow.addView(imageView0, j);
            }
            tableMapUgledar.addView(tableRow, i);

        }

    }

    void visibleMedia(int rowIndex, int colIndex){

        ViewGroup.LayoutParams layoutParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);

        ViewGroup.LayoutParams layoutParams2=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 0.60f);
        ViewGroup.LayoutParams layoutParamsText=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        tableMapUgledar.removeAllViews();
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout linearLayoutSt=new LinearLayout(this); //Статус закгрузки
        LinearLayout linearLayoutUl=new LinearLayout(this); //Улица
        LinearLayout linearLayoutMed=new LinearLayout(this); //Медиа

        LinearLayout linearLayoutMed1=new LinearLayout(this); //Медиа1
        linearLayoutMed1.setOrientation(LinearLayout.VERTICAL);
        TextView textView1=new TextView(this);
        textView1.setText("1");
        textView1.setLayoutParams(layoutParamsText);
        linearLayoutMed1.addView(textView1);

        LinearLayout linearLayoutMed2=new LinearLayout(this); //Медиа2
        linearLayoutMed2.setOrientation(LinearLayout.VERTICAL);
        TextView textView2=new TextView(this);
        textView2.setText("2");
        textView2.setLayoutParams(layoutParamsText);
        linearLayoutMed2.addView(textView2);

        LinearLayout linearLayoutMed3=new LinearLayout(this); //Медиа3
        linearLayoutMed3.setOrientation(LinearLayout.VERTICAL);
        TextView textView3=new TextView(this);
        textView3.setText("3");
        textView3.setLayoutParams(layoutParamsText);
        linearLayoutMed3.addView(textView3);

        LinearLayout linearLayoutMed4=new LinearLayout(this); //Медиа4
        linearLayoutMed4.setOrientation(LinearLayout.VERTICAL);
        TextView textView4=new TextView(this);
        textView4.setText("4");
        textView4.setLayoutParams(layoutParamsText);
        linearLayoutMed4.addView(textView4);

        LinearLayout linearLayoutMed5=new LinearLayout(this); //Медиа5
        linearLayoutMed5.setOrientation(LinearLayout.VERTICAL);
        TextView textView5=new TextView(this);
        textView5.setText("5");
        textView5.setLayoutParams(layoutParamsText);
        linearLayoutMed5.addView(textView5);

        LinearLayout linearLayoutMed6=new LinearLayout(this); //Медиа6
        linearLayoutMed6.setOrientation(LinearLayout.VERTICAL);
        TextView textView6=new TextView(this);
        textView6.setText("6");
        textView6.setLayoutParams(layoutParamsText);
        linearLayoutMed6.addView(textView6);

        LinearLayout linearLayoutMed7=new LinearLayout(this); //Медиа5
        linearLayoutMed7.setOrientation(LinearLayout.VERTICAL);
        TextView textView7=new TextView(this);
        textView7.setText("7");
        textView7.setLayoutParams(layoutParamsText);
        linearLayoutMed7.addView(textView7);

        LinearLayout linearLayoutMed8=new LinearLayout(this); //Медиа5
        linearLayoutMed8.setOrientation(LinearLayout.VERTICAL);
        TextView textView8=new TextView(this);
        textView8.setText("8");
        textView8.setLayoutParams(layoutParamsText);
        linearLayoutMed8.addView(textView8);

        LinearLayout linearLayoutMed9=new LinearLayout(this); //Медиа5
        linearLayoutMed9.setOrientation(LinearLayout.VERTICAL);
        TextView textView9=new TextView(this);
        textView9.setText("9");
        textView9.setLayoutParams(layoutParamsText);
        linearLayoutMed9.addView(textView9);

        LinearLayout linearLayoutMed10=new LinearLayout(this); //Медиа5
        linearLayoutMed10.setOrientation(LinearLayout.VERTICAL);
        TextView textView10=new TextView(this);
        textView10.setText("10");
        textView10.setLayoutParams(layoutParamsText);
        linearLayoutMed10.addView(textView10);

        LinearLayout linearLayoutMedia=null;
        linearLayout.addView(linearLayoutMed1, layoutParams);
        linearLayout.addView(linearLayoutMed2, layoutParams);
        linearLayout.addView(linearLayoutMed3, layoutParams);
        linearLayout.addView(linearLayoutMed4, layoutParams);
        linearLayout.addView(linearLayoutMed5, layoutParams);
        linearLayout.addView(linearLayoutMed6, layoutParams);
        linearLayout.addView(linearLayoutMed7, layoutParams);
        linearLayout.addView(linearLayoutMed8, layoutParams);
        linearLayout.addView(linearLayoutMed9, layoutParams);
        linearLayout.addView(linearLayoutMed10, layoutParams);

        linearLayout.setBackgroundColor(Color.argb(255, 0, 0, 0));
        //layoutParams.height=100;
        //layoutParams.width=100;
        //TextView textView = new TextView(this);
        //textView.setText(rowIndex +"-"+ colIndex);
        //textView.setLayoutParams(layoutParamsText);
        //linearLayoutUl.addView(textView);


        if (rowIndex<5)rowIndex=5;
        if (rowIndex>55)rowIndex=55;
        for (int i=0; i<rowIndex-5; i++){
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            ImageView imageView0 = new ImageView(this);
            imageView0.setImageResource(R.drawable.bombared);
            tableRow.addView(imageView0);
            tableMapUgledar.addView(tableRow, i);
        }
        tableMapUgledar.addView(linearLayout, layoutParams);
        if (colIndex<=8)linearLayoutMedia=linearLayoutMed1;
        if (colIndex>=9&&colIndex<=16)linearLayoutMedia=linearLayoutMed2;
        if (colIndex>=17&&colIndex<=24)linearLayoutMedia=linearLayoutMed3;
        if (colIndex>=25&&colIndex<=32)linearLayoutMedia=linearLayoutMed4;
        if (colIndex>=33&&colIndex<=40)linearLayoutMedia=linearLayoutMed5;
        if (colIndex>=41&&colIndex<=48)linearLayoutMedia=linearLayoutMed6;
        if (colIndex>=49&&colIndex<=56)linearLayoutMedia=linearLayoutMed7;
        if (colIndex>=47&&colIndex<=64)linearLayoutMedia=linearLayoutMed8;
        if (colIndex>=65&&colIndex<=72)linearLayoutMedia=linearLayoutMed9;
        if (colIndex>=73)linearLayoutMedia=linearLayoutMed10;

        TextView textUl=new TextView(this);
        textUl.setText("ул.Шахткрская, дом №30");
        textUl.setLayoutParams(layoutParamsText);
        linearLayoutUl.addView(textUl);
        linearLayoutMedia.addView(linearLayoutUl, layoutParams);

        ImageView imageViewMedia=new ImageView(this);
        imageViewMedia.setImageResource(R.drawable.bombared2);
        linearLayoutMed.addView(imageViewMedia);
        linearLayoutMedia.addView(linearLayoutMed, layoutParams);

        TextView textStatus=new TextView(this);
        textStatus.setText("Подключение к серверу...");
        linearLayoutSt.addView(textStatus);
        linearLayoutMedia.addView(linearLayoutSt, layoutParams);
    }


}