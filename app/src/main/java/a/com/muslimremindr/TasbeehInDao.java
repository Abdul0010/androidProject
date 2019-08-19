package a.com.muslimremindr;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface TasbeehInDao {
    @Insert
    void insertProduct(DataEntity tasbeeh);

    @Query("SELECT * FROM data WHERE name = :name")
    DataEntity findTabeeh(String name);


    @Update
    public void update(DataEntity... tasbeehEntities);


}
