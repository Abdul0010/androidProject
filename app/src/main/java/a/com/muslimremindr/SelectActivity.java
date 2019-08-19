package a.com.muslimremindr;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        // غير ملف الصون
         mediaPlayer=MediaPlayer.create(this, R.raw.azka1);

    }

    public void read(View view) {
        Intent intent= new Intent(this,AzkarSalahActivity.class);
        startActivity(intent);
    }

    public void play(View view) {
        // شيك اذا ملف الام بي ثر موجود
        if(mediaPlayer==null){
            mediaPlayer=MediaPlayer.create(this, R.raw.azka1);

        }

        mediaPlayer.start();
    }

    public void stop(View view) {
        // لما توقف يمستح ملف الام بي تري
        mediaPlayer.stop();
        mediaPlayer.release();

        mediaPlayer=null;
    }
}
