package math.uni.lodz.pl.memorygame;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class GameMain2 extends AppCompatActivity {

    //Button button = (Button) findViewById(R.id.imageButton);
    String path1,path2,path3,path4,path5,path6,path7,path8,path9,path10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main2);



    //database
    SimpleDatabaseHelper db = new SimpleDatabaseHelper(this);
    Cursor k = db.getAll();

    int j=0;
        while(k.moveToNext())
    {
        j++;
        //1
        if (j == 1)
        {
            path1 = k.getString(2);
        }
        if (j == 2)
        {
            path2 = k.getString(2);
        }
        if (j == 3)
        {
            path3 = k.getString(2);
        }
        if (j == 4)
        {
            path4 = k.getString(2);
        }
        if (j == 5)
        {
            path5 = k.getString(2);
        }
        if (j == 6)
        {
            path6 = k.getString(2);
        }
        if (j == 7)
        {
            path7 = k.getString(2);
        }
        if (j == 8)
        {
            path8 = k.getString(2);
        }
        if (j == 9)
        {
            path9 = k.getString(2);
        }
        if (j == 10)
        {
            path10 = k.getString(2);
        }
        if(j==10)break;
    }

    }


    public boolean swap1 = true;
    public boolean swap2 = true;
    public boolean swap3 = true;
    public boolean swap4 = true;
    public boolean swap5 = true;
    public boolean swap6 = true;
    public boolean swap7 = true;
    public boolean swap8 = true;
    public boolean swap9 = true;
    public boolean swap10 = true;

    public int clickCounter = 0;
    public int tag1 = 0;
    public int tag2 = 0;
    public boolean gotTag1 = false;
    public  void change1(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton);
            if (swap1) {
                //i.setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() +
                //        File.separator + "MemoryGamePictures" + File.separator + "Noga" + "/pic1.jpg"));
                i.setImageBitmap(BitmapFactory.decodeFile(path1));
                swap1 = false;
            } else {
                swap1 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 1;
                gotTag1 = true;
            }

        }
        if(clickCounter==2)
        {
            tag2=1;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change2(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton2);
            if (swap2) {
                i.setImageBitmap(BitmapFactory.decodeFile(path2));
                swap2 = false;
            } else {
                swap2 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 1;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=1;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change3(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton3);
            if (swap3) {
                i.setImageBitmap(BitmapFactory.decodeFile(path3));
                swap3 = false;
            } else {
                swap3 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 2;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=2;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change4(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton4);
            if (swap4) {
                i.setImageBitmap(BitmapFactory.decodeFile(path4));
                swap4 = false;
            } else {
                swap4 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 2;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=2;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change5(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton5);
            if (swap5) {
                i.setImageBitmap(BitmapFactory.decodeFile(path5));
                swap5 = false;
            } else {
                swap5 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 3;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=3;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change6(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton6);
            if (swap6) {
                i.setImageBitmap(BitmapFactory.decodeFile(path6));
                swap6 = false;
            } else {
                swap6 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 3;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=3;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change7(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton7);
            if (swap7) {
                i.setImageBitmap(BitmapFactory.decodeFile(path7));
                swap7 = false;
            } else {
                swap7 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 4;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=4;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change8(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton8);
            if (swap8) {
                i.setImageBitmap(BitmapFactory.decodeFile(path8));
                swap8 = false;
            } else {
                swap8 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 4;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=4;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change9(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton9);
            if (swap9) {
                i.setImageBitmap(BitmapFactory.decodeFile(path9));
                swap9 = false;
            } else {
                swap9 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 5;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=5;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }
    public  void change10(View view) {
        if(clickCounter==0 || clickCounter==1)
        {
            ImageButton i = (ImageButton) findViewById(R.id.imageButton10);
            if (swap10) {
                i.setImageBitmap(BitmapFactory.decodeFile(path10));
                swap10 = false;
            } else {
                swap10 = true;
                i.setImageResource(R.drawable.q_mark);
            }
            clickCounter++;
            if(!gotTag1)
            {
                tag1= 5;
                gotTag1 = true;
            }
        }
        if(clickCounter==2)
        {
            tag2=5;
            if(tag1==tag2)
            {
                Toast.makeText(getApplication(),"Its a match!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
            else
            {
                Toast.makeText(getApplication(),"Try again!", Toast.LENGTH_SHORT).show();
                clickCounter=0;
                gotTag1=false;
            }
        }

    }


}