package math.uni.lodz.pl.memorygame;

import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class GameMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        ImageView mImageView;
        String path;
        //1
        /*
        mImageView = findViewById(R.id.imageView);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Noga"+ "/pic1.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        //2
        mImageView = findViewById(R.id.imageView2);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Noga"+ "/pic2.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        //3
        mImageView = findViewById(R.id.imageView3);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Reka"+ "/pic1.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        //4
        mImageView = findViewById(R.id.imageView4);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Reka"+ "/pic2.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        //5
        mImageView = findViewById(R.id.imageView5);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Krzeslo"+ "/pic1.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        /6
        mImageView = findViewById(R.id.imageView6);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Krzeslo"+ "/pic2.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        /7
        mImageView = findViewById(R.id.imageView7);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Sciana"+ "/pic1.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        //8
        mImageView = findViewById(R.id.imageView8);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Sciana"+ "/pic2.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        */
        //9
        mImageView = findViewById(R.id.imageView9);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Komputer"+ "/pic1.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));
        //10
        mImageView = findViewById(R.id.imageView10);
        path =( Environment.getExternalStorageDirectory() +
                File.separator + "MemoryGamePictures" + File.separator +"Komputer"+ "/pic2.jpg");
        mImageView.setImageBitmap(BitmapFactory.decodeFile(path));

    }
}