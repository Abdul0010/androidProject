package a.com.muslimremindr;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    NotificationCompat.Builder notification;
    private static final int unqi=3456;
    @Override
    public void onReceive(Context context, Intent intent) {
       Log.d("My alaram is working","working");

       //صوت التنبيه
        Uri soundUri = RingtoneManager.getDefaultUri(R.raw.azan1);
        Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        notification= new NotificationCompat.Builder(context);
        notification.setAutoCancel(true);
        notification.setSmallIcon(R.drawable.quran);// الايقونه
        notification.setTicker("prayer time");// العنوان
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(" Prayer time");//عنوان الصندوق
        notification.setContentText(" time to pray");// الرساله
        notification .setStyle(new NotificationCompat.BigTextStyle());
        // فين يروح لما يضغط الرساله
        PendingIntent pendingIntent= PendingIntent.getActivity(context, 0, new Intent(), PendingIntent.FLAG_UPDATE_CURRENT);
//        notification.setContentIntent(pendingIntent);

        notification.setSound(uri);
        notification.setContentIntent(pendingIntent);
        NotificationManager manager2=(NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
        manager2.notify(unqi,notification.build());
        MediaPlayer mediaPlayer=MediaPlayer.create(context, R.raw.azan1);
//        mediaPlayer.start();
//        try {
//            sleep(6000);
//         //   mediaPlayer.stop();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }





    }
}
