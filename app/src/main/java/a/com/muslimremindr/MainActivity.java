package a.com.muslimremindr;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    NotificationCompat.Builder notification;
    private static final int unqi=3456;
    private static final int unqi2=3457;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        Intent intent=new Intent(this,AlarmReceiver.class);
        Intent intent2=new Intent(this,AlarmReceiver2.class);

        PendingIntent pendingIntent=   PendingIntent.getBroadcast(this,unqi,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        PendingIntent pendingIntent2=   PendingIntent.getBroadcast(this,unqi2,intent2,PendingIntent.FLAG_UPDATE_CURRENT);
        Calendar timeNow = Calendar.getInstance();

//        Calendar fager = Calendar.getInstance();
//        fager.setTimeInMillis(System.currentTimeMillis());
//        fager.set(Calendar.HOUR_OF_DAY,10);
//        fager.set(Calendar.MINUTE,54);
//        fager.set(Calendar.SECOND,00);
//
//        Calendar fager2 = Calendar.getInstance();
//        fager2.setTimeInMillis(System.currentTimeMillis());
//        fager2.set(Calendar.HOUR_OF_DAY, 10);
//        fager2.set(Calendar.MINUTE,56);
//        fager2.set(Calendar.SECOND,00);
//        Calendar Dhuhr = Calendar.getInstance();
//        Dhuhr.setTimeInMillis(System.currentTimeMillis());
//        Dhuhr.set(Calendar.HOUR_OF_DAY, 8);
//        Dhuhr.set(Calendar.MINUTE,45);
//        Dhuhr.set(Calendar.SECOND,00);
//
//        Calendar Dhuhr2 = Calendar.getInstance();
//        Dhuhr2.setTimeInMillis(System.currentTimeMillis());
//        Dhuhr2.set(Calendar.HOUR_OF_DAY, 8);
//        Dhuhr2.set(Calendar.MINUTE,46);
//        Dhuhr2.set(Calendar.SECOND,00);
//
//
//
//        Calendar Asr = Calendar.getInstance();
//        Asr.setTimeInMillis(System.currentTimeMillis());
//        Asr.set(Calendar.HOUR_OF_DAY, 8);
//        Asr.set(Calendar.MINUTE,48);
//        Asr.set(Calendar.SECOND,00);
//
//        Calendar Asr2 = Calendar.getInstance();
//        Asr2.setTimeInMillis(System.currentTimeMillis());
//        Asr2.set(Calendar.HOUR_OF_DAY, 8);
//        Asr2.set(Calendar.MINUTE,49);
//        Asr2.set(Calendar.SECOND,00);
//
//        Calendar Maghrib = Calendar.getInstance();
//        Maghrib.setTimeInMillis(System.currentTimeMillis());
//        Maghrib.set(Calendar.HOUR_OF_DAY, 8);
//        Maghrib.set(Calendar.MINUTE,50);
//        Maghrib.set(Calendar.SECOND,00);
//
//        Calendar Maghrib2 = Calendar.getInstance();
//        Maghrib2.setTimeInMillis(System.currentTimeMillis());
//        Maghrib2.set(Calendar.HOUR_OF_DAY, 8);
//        Maghrib2.set(Calendar.MINUTE,51);
//        Maghrib2.set(Calendar.SECOND,00);
//
//        Calendar Isha = Calendar.getInstance();
//        Isha.setTimeInMillis(System.currentTimeMillis());
//        Isha.set(Calendar.HOUR_OF_DAY, 8);
//        Isha.set(Calendar.MINUTE,52);
//        Isha.set(Calendar.SECOND,00);
//
//        Calendar Isha2 = Calendar.getInstance();
//        Isha2.setTimeInMillis(System.currentTimeMillis());
//        Isha2.set(Calendar.HOUR_OF_DAY,8);
//        Isha2.set(Calendar.MINUTE,50);
//        Isha2.set(Calendar.SECOND,00);
//
//
//        if(Dhuhr.before(timeNow)){
//            Dhuhr.add(Calendar.DATE, 1);
//        }
//        if(Dhuhr2.before(timeNow)){
//            Dhuhr2.add(Calendar.DATE, 1);
//        }
//        if(fager.before(timeNow)){
//            fager.add(Calendar.DATE, 1);
//        }
//        if(fager2.before(timeNow)){
//            fager2.add(Calendar.DATE, 1);
//        }
//        if(Asr.before(timeNow)){
//            Asr.add(Calendar.DATE, 1);
//        }
//        if(Asr2.before(timeNow)){
//            Asr2.add(Calendar.DATE, 1);
//        }
//        if(Maghrib.before(timeNow)){
//            Maghrib.add(Calendar.DATE, 1);
//        }
//        if(Maghrib2.before(timeNow)){
//            Maghrib2.add(Calendar.DATE, 1);
//        }
//        if(Isha.before(timeNow)){
//            Isha.add(Calendar.DATE, 1);
//        }
//        if(Isha2.before(timeNow)){
//            Isha2.add(Calendar.DATE, 1);
//        }
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Dhuhr.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent);
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Dhuhr2.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);
//        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, fager.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent);
//        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, fager2.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Asr.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent);
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Asr2.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Maghrib.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent);
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Maghrib2.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);
////        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Isha.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);
//        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, Isha2.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);
        Calendar calendar = Calendar.getInstance();

        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE,53);
        calendar.set(Calendar.SECOND,00);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.set(Calendar.HOUR_OF_DAY, 8);
        calendar2.set(Calendar.MINUTE,54);
        calendar.set(Calendar.SECOND,00);


        if(calendar.before(timeNow)){
            calendar.add(Calendar.DATE, 1);
        }
        if(calendar2.before(timeNow)){
            calendar2.add(Calendar.DATE, 1);
        }
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(),AlarmManager.INTERVAL_DAY, pendingIntent2);

    }












    // لما تضغط اللز تجي هنا
    public void tasbeeh(View view){

        Intent intent= new Intent(MainActivity.this, Tasbeeh.class);
        startActivity(intent);
    }
    public void AzkarPrayer(View view){
        Intent intent= new Intent(MainActivity.this,SelectActivity.class);
        startActivity(intent);
    }
    public void AzkarMorningEvening(View view){
        Intent intent= new Intent(this,AzkarMorning.class);
        startActivity(intent);
    }
}
