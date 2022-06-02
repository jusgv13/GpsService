package cr.ac.gpsservice.dao

import cr.ac.gpsservice.entity.Location
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface LocationDao {

    @Insert
    fun insert(location: Location)

    @Query("select * from location_table")
    fun query() : List<Location>

}