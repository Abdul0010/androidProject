package a.com.muslimremindr;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.IBinder;

public class Service extends android.app.Service {
    private NotificationManager notificationManager;

    //@androidx.annotation.Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

}