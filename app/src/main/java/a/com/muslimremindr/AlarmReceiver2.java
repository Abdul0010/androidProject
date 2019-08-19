package a.com.muslimremindr;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

public class AlarmReceiver2 extends BroadcastReceiver {
    private static final int unqi=3456;
    @Override
    public void onReceive(Context context, Intent intent) {
       Log.d("My alaram is working","working");

       NotificationManager notificationManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Uri soundUri = RingtoneManager.getDefaultUri(R.raw.azan1);
        Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        Intent intent1=new Intent(context, Tasbeeh.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent= PendingIntent.getActivity(context, 100, new Intent(context, Tasbeeh.class), PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(context)
        .setAutoCancel(true)
        .setSmallIcon(R.drawable.prayer)

        .setTicker("prayer Azkar")
        .setWhen(System.currentTimeMillis())
        .setContentTitle(" Prayer Akzar")
        .setContentText(" Azkar after prayer")
         .setStyle(new NotificationCompat.BigTextStyle())
        .setSound(uri)

        .setContentIntent(pendingIntent);
        notificationManager.notify(100,builder.build());
//        NotificationManager manager2=(NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
//        manager2.notify(unqi,notification.build());
//        MediaPlayer mediaPlayer=MediaPlayer.create(context, R.raw.azan1);
//        mediaPlayer.start();
//        try {
//            sleep(6000);
//         //   mediaPlayer.stop();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
