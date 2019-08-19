package a.com.muslimremindr;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tasbeeh extends AppCompatActivity {

    int counter=0;

    Button button,next;
    private TextView first;
    private TasbeehInDao tasbeehInDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_tasbeeh);
        first=findViewById(R.id.first_v);
        Database database= Room.databaseBuilder(this,Database.class,"muslimReminder").allowMainThreadQueries().
        build();
        tasbeehInDao= database.getTasbeehDao();
//
       DataEntity tasbeeh2=tasbeehInDao.findTabeeh("first");
       if(tasbeeh2!=null){
           if(tasbeeh2.getCount()<33){
               first.setText(String.valueOf(tasbeeh2.getCount()));
               counter=tasbeeh2.getCount();}
       }






        super.onCreate(savedInstanceState);



    }

    public void count(View view){
        counter=counter+1;

        DataEntity tasbeeh= tasbeehInDao.findTabeeh("first");
        if(tasbeeh!=null){

            tasbeeh.setCount(counter);
            tasbeehInDao.update(tasbeeh);
        }
        else{
            DataEntity data= new DataEntity();
            data.setCount(counter);
            data.setName("first");
            tasbeehInDao.insertProduct(data);
        }
//

        // يمكن التحكم بعدد التسبيح من هنا
        if(Integer.parseInt(first.getText().toString())<33){
            first.setText("" + counter);
        }
        else{
            // اذا وصل العدد الي 33 اخفي زر كاونت
            button=findViewById(R.id.count);

            button.setVisibility(view.GONE);


            next=findViewById(R.id.next);
            next.setVisibility(view.VISIBLE);
        }


    }
    public void Next(View view){

        Intent intent= new Intent(Tasbeeh.this,Tasbeeh2.class);
        startActivity(intent);
    }
}
