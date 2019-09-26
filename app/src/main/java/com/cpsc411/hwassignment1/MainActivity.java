package com.cpsc411.hwassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.graphics.Typeface.BOLD;
import static android.view.Gravity.CENTER;
import static android.view.Gravity.CENTER_VERTICAL;
import static android.view.Gravity.LEFT;
import static android.view.Gravity.RIGHT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        HorizontalScrollView sv = new HorizontalScrollView(this);

        LinearLayout root = new LinearLayout(this);
        root.setBackgroundColor(Color.BLACK);
        LinearLayout.LayoutParams rootLP = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        root.setLayoutParams(rootLP);

        LinearLayout rows = new LinearLayout(this);
        rows.setOrientation(LinearLayout.VERTICAL);
        rows.setBackgroundColor(0xFF90908E);
        LinearLayout.LayoutParams rowsLP = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        rows.setLayoutParams(rowsLP);
        root.addView(rows);

        for(int i = 1; i <= 11; i++){
            TextView no = new TextView(this);
            no.setText("" + i);
            no.setBackgroundColor(0xFFD4D0C8);
            no.setTextColor(Color.BLACK);
            no.setGravity(CENTER);
            LinearLayout.LayoutParams noLP = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            noLP.setMargins(2,2,2,2);
            noLP.weight = 1;
            no.setLayoutParams(noLP);
            rows.addView(no);
        }

        GridLayout table = new GridLayout(this);
        table.setRowCount(11);
        table.setColumnCount(4);
        ViewGroup.LayoutParams tableLP = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        table.setLayoutParams(tableLP);
        root.addView(table);

        createWidgetAtCell(table, 0, 0, "Rules void hello1(int hour)", Color.BLACK, Color.WHITE,1, 4, 1f, 4f, CENTER, 0, 0, 4, 4, 4);
        createWidgetAtCell(table, 1, 0, "properties", Color.WHITE, Color.BLACK, 2, 1, 2f, 1f, CENTER, 0, 0, 4, 4, 4);
        createWidgetAtCell(table, 1, 1, "name", Color.WHITE, Color.BLACK, 1, 2, 1f, 2f, CENTER, 0, 4, 4, 4, 2);
        createWidgetAtCell(table, 1, 3, "Day Hour Classification", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 4, 4, 4, 2);
        createWidgetAtCell(table, 2, 1, "category", Color.WHITE, Color.BLACK, 1, 2, 1f, 2f, CENTER, 0, 4, 4, 2, 4);
        createWidgetAtCell(table, 2, 3, "Day and Time", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 4, 4, 2, 4);
        createWidgetAtCell(table, 3, 0, "Rule", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 0, 4, 4, 4);
        createWidgetAtCell(table, 3, 1, "C1", 0xFFCCFFFF, Color.BLACK, 1, 2, 1f, 2f, CENTER, 1, 4, 4, 4, 4);
        createWidgetAtCell(table, 3, 3, "A1", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 4, 4, 4, 4);
        createWidgetAtCell(table, 4, 0, "", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 0, 4, 4, 4);
        createWidgetAtCell(table, 4, 1, "min <= hour && hour <= max", 0xFFCCFFFF, Color.BLACK, 1, 2, 1f, 2f, CENTER, 1, 4, 4, 4, 2);
        createWidgetAtCell(table, 4, 3, "System.out.println(greeting + \",World!\")", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 4, 4, 4, 2);
        createWidgetAtCell(table, 5, 0, "", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 0, 4, 2, 4);
        createWidgetAtCell(table, 5, 1, "int min", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 4, 2, 2, 4);
        createWidgetAtCell(table, 5, 2, "int max", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 2, 4, 2, 4);
        createWidgetAtCell(table, 5, 3, "String greeting", 0xFFCCFFFF, Color.BLACK, 1, 1, 1f, 1f, CENTER, 1, 4, 4, 2, 4);
        createWidgetAtCell(table, 6, 0, "Rule", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 1, 0, 4, 4, 4);
        createWidgetAtCell(table, 6, 1, "From", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 1, 4, 2, 4, 4);
        createWidgetAtCell(table, 6, 2, "To", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 1, 2, 4, 4, 4);
        createWidgetAtCell(table, 6, 3, "Greeting", 0xFFFFCC99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 1, 4, 4, 4, 4);
        createWidgetAtCell(table, 7, 0, "R10", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 0, 4, 4, 2);
        createWidgetAtCell(table, 7, 1, "0", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 4, 2, 4, 2);
        createWidgetAtCell(table, 7, 2, "11", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 2, 4, 4, 2);
        createWidgetAtCell(table, 7, 3, "Good Morning", 0xFFFFCC99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 4, 4, 4, 2);
        createWidgetAtCell(table, 8, 0, "R20", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 0, 4, 2, 2);
        createWidgetAtCell(table, 8, 1, "12", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 4, 2, 2, 2);
        createWidgetAtCell(table, 8, 2, "17", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 2, 4, 2, 2);
        createWidgetAtCell(table, 8, 3, "Good Afternoon", 0xFFFFCC99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 4, 4, 2, 2);
        createWidgetAtCell(table, 9, 0, "R30", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 0, 4, 2, 2);
        createWidgetAtCell(table, 9, 1, "18", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 4, 2, 2, 2);
        createWidgetAtCell(table, 9, 2, "21", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 2, 4, 2, 2);
        createWidgetAtCell(table, 9, 3, "Good Evening", 0xFFFFCC99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 4, 4, 2, 2);
        createWidgetAtCell(table, 10, 0, "R40", Color.WHITE, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 0, 4, 2, 4);
        createWidgetAtCell(table, 10, 1, "22", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 4, 2, 2, 4);
        createWidgetAtCell(table, 10, 2, "23", 0xFFFFFF99, Color.BLACK, 1, 1, 1f, 1f, RIGHT, 0, 2, 4, 2, 4);
        createWidgetAtCell(table, 10, 3, "Good Night", 0xFFFFCC99, Color.BLACK, 1, 1, 1f, 1f, LEFT, 0, 4, 4, 2, 4);

        sv.addView(root);

        //Java view
        setContentView(sv);

        //Resource File view
        //setContentView(R.layout.horzontalscrollview);
    }

    private void createWidgetAtCell(GridLayout g, int row, int col, String s, int color_background,
                                    int color_text, int size_row, int size_col, float weight_row, float weight_col, int gravity, int bold,
                                    int margin_left, int margin_right, int margin_up, int margin_down){
        TextView tv = new TextView(this);
        tv.setText(s);
        tv.setBackgroundColor(color_background);
        tv.setTextColor(color_text);
        tv.setGravity(gravity | CENTER_VERTICAL);
        tv.setPadding(8,8,8,8);
        tv.setMinWidth(640);
        if(bold == 1)
            tv.setTypeface(null, BOLD);

        GridLayout.Spec row_spec = GridLayout.spec(row, size_row, weight_row);
        GridLayout.Spec col_spec = GridLayout.spec(col, size_col, weight_col);
        GridLayout.LayoutParams gridLP = new GridLayout.LayoutParams(row_spec, col_spec);
        gridLP.setMargins(margin_left, margin_up, margin_right, margin_down);
        tv.setLayoutParams(gridLP);

        g.addView(tv);
    }
}
