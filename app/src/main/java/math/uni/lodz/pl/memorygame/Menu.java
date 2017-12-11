package math.uni.lodz.pl.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void gotoGameActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), GameMain.class));
    }
    public void zdjecie1(View view)
    {
        startActivity(new Intent(getApplicationContext(), GameMain.class));
    }
}


