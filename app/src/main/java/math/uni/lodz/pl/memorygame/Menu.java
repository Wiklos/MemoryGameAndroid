package math.uni.lodz.pl.memorygame;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

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

        /*
        AutoCompleteTextView firstCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        AutoCompleteTextView secondCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        AutoCompleteTextView thirdCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        AutoCompleteTextView fourthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        AutoCompleteTextView fifthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);


        String firstC = firstCategory.getText().toString();
        String secondC = secondCategory.getText().toString();
        String thirdC = thirdCategory.getText().toString();
        String fourthC = fourthCategory.getText().toString();
        String firthC = fifthCategory.getText().toString();

        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        // put the name and phone(to be sent to other activity) in intent
        intent.putExtra("FIRST_C", firstC );
        intent.putExtra("SECOND_C", secondC );
        intent.putExtra("THIRD_C", thirdC );
        intent.putExtra("FOURTH_C", fourthC );
        intent.putExtra("FIFTH_C", firthC );
        startActivity(intent);
        */
        AutoCompleteTextView firstCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String stringCategory = firstCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "first";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie2(View view)
    {
        AutoCompleteTextView firstCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String stringCategory = firstCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "second";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie3(View view)
    {
        AutoCompleteTextView secondCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        String stringCategory = secondCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "first";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie4(View view)
    {
        AutoCompleteTextView secondCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        String stringCategory = secondCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "second";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie5(View view)
    {
        AutoCompleteTextView thirdCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        String stringCategory = thirdCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "first";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie6(View view)
    {
        AutoCompleteTextView thirdCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        String stringCategory = thirdCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "second";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie7(View view)
    {
        AutoCompleteTextView fourthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        String stringCategory = fourthCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "first";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie8(View view)
    {
        AutoCompleteTextView fourthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        String stringCategory = fourthCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "second";
        intent.putExtra("ORDER", order );

        startActivity(intent);
    }
    public void zdjecie9(View view)
    {
        AutoCompleteTextView fifthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);
        String stringCategory = fifthCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "first";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
    public void zdjecie10(View view)
    {
        AutoCompleteTextView fifthCategory = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);
        String stringCategory = fifthCategory.getText().toString();
        Intent intent = new Intent(getApplicationContext(),AndroidCameraApi.class);
        intent.putExtra("CATEGORY", stringCategory );
        String order = "second";
        intent.putExtra("ORDER", order );
        startActivity(intent);
    }
}


