package com.example.diego.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;
    boolean hideFab = false;
    boolean moveFab = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomAppBar = findViewById(R.id.bottomBar);
        setSupportActionBar(bottomAppBar);
        floatingActionButton = findViewById(R.id.fabBottomBar);


        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hideFab){
                    floatingActionButton.show();
                    hideFab=false;
                }else{
                    floatingActionButton.hide();
                    hideFab=true;
                }
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(moveFab){
                    bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
                    moveFab = false;
                }else{
                    bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
                    moveFab = true;
                }
            }
        });

    }
}
