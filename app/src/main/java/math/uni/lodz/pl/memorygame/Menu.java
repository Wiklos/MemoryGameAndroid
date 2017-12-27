package math.uni.lodz.pl.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

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
    {        // create a new intent
        //Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        // put the name and phone(to be sent to other activity) in intent
        //intent.putExtra("FIRST_C", firstC );
        //startActivity(intent);

        //startActivity(new Intent(getApplicationContext(), AndroidCameraApi.class));



        /////nowy


        AutoCompleteTextView firstCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        AutoCompleteTextView secondCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        AutoCompleteTextView thirdCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        AutoCompleteTextView fourthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        AutoCompleteTextView fifthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);


        String firstC = firstCategory.getText().toString();

        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        // put the name and phone(to be sent to other activity) in intent
        intent.putExtra("FIRST_C", firstC );
        startActivity(intent);
    }
}


