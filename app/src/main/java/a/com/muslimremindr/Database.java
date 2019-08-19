package a.com.muslimremindr;


import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@android.arch.persistence.room.Database(entities = DataEntity.class,version =5)
public abstract class Database extends RoomDatabase {
    public abstract TasbeehInDao getTasbeehDao();
    private static Database INSTANCE;

    static Database getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Database.class) {
                if (INSTANCE == null) {
                    INSTANCE =
                            Room.databaseBuilder(context.getApplicationContext(),
                                    Database.class,
                                    "database").build();
                }
            }
        }
        return INSTANCE;
    }
}
