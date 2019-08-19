package a.com.muslimremindr;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tasbeeh3 extends AppCompatActivity {

    int counter=0;
    int counter2=0;
    int counter3=0;
    Button button,next;
    private TextView thrid;
    private TasbeehInDao tasbeehInDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbeeh3);
        thrid=findViewById(R.id.first_v);


        Database database= Room.databaseBuilder(this,Database.class,"muslimReminder").allowMainThreadQueries().
                build();
        tasbeehInDao= database.getTasbeehDao();
        DataEntity tasbeeh2=tasbeehInDao.findTabeeh("third");
        if(tasbeeh2!=null){
            System.out.println(tasbeeh2.getCount()+tasbeeh2.getName());


            if(tasbeeh2.getCount()<33){
                thrid.setText(String.valueOf(tasbeeh2.getCount()));
                counter=tasbeeh2.getCount();}

        }

    }

    public void count(View view){
        counter=counter+1;
        counter2=counter2+1;
        counter3=counter3+1;
        DataEntity tasbeeh= tasbeehInDao.findTabeeh("third");
        if(tasbeeh!=null){

            tasbeeh.setCount(counter);
            tasbeehInDao.update(tasbeeh);
        }
        else{
            DataEntity data= new DataEntity();
            data.setCount(counter);
            data.setName("third");
            tasbeehInDao.insertProduct(data);
        }
//
        if(Integer.parseInt(thrid.getText().toString())<33){
            thrid.setText("" + counter);
        }
        else{
            button=findViewById(R.id.count);
            button.setVisibility(view.GONE);
            next=findViewById(R.id.next);
            next.setVisibility(view.VISIBLE);
        }


    }
    public void Next(View view){

        Intent intent= new Intent(this,AzkarSalahActivity.class);
        startActivity(intent);
    }
}
