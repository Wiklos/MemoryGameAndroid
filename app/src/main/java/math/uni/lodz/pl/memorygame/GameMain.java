package math.uni.lodz.pl.memorygame;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class GameMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        //database
        SimpleDatabaseHelper db = new SimpleDatabaseHelper(this);
        Cursor k = db.getAll();

        ImageView mImageView;
        String path;
        int j=0;
        while(k.moveToNext()) {
            j++;
            //1
            if(j==1)
            {
                mImageView = findViewById(R.id.imageView);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));

            }

            //2
            if(j==2)
            {
                mImageView = findViewById(R.id.imageView2);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }
            //3
            if(j==3)
            {
                mImageView = findViewById(R.id.imageView3);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }
            //4
            if(j==4)
            {
                mImageView = findViewById(R.id.imageView4);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }
            //5
            if(j==5)
            {
                mImageView = findViewById(R.id.imageView5);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }
            //6
            if(j==6)
            {
                mImageView = findViewById(R.id.imageView6);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }

            //7
            if(j==7)
            {
                mImageView = findViewById(R.id.imageView7);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));

            }
            //8
            if(j==8)
            {
                mImageView = findViewById(R.id.imageView8);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }

            //9
            if(j==9)
            {
                mImageView = findViewById(R.id.imageView9);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }
            //10
            if(j==10)
            {
                mImageView = findViewById(R.id.imageView10);
                String nr = k.getString(2);
                path = nr;
                mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
            }
            if(j==10)break;
        }
        j=0;
        k.close();

        //baza danych
        TextView tv = (TextView)findViewById(R.id.textView2);

        //SimpleDatabaseHelper db = new SimpleDatabaseHelper(this);

        for(int i=0;i<10;i++)
        {
           // db.add("tempCategory","TempPath");
        }



        Cursor p = db.getAll();
        int y=0;

        while(p.moveToNext())
        {
            y++;
            int id = p.getInt(0);
            String tytul = p.getString(1);
            String nr = p.getString(2);
            tv.setText(tv.getText()+"\n"+"ID:"+id+" Category:"+tytul+" "+"Path:"+nr);
            if(y==10)break;
        }

        p.close();
        y=0;


    }
    public void gotoGame2Activity(View view)
    {
        startActivity(new Intent(getApplicationContext(), GameMain2.class));
    }
}