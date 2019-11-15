package com.example.roomdatabase.abstrak;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomdatabase.entity.Barang;
import com.example.roomdatabase.interfaces.BarangDAO;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}
