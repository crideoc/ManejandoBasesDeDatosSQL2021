package com.example.manejandobasesdedatossql2021;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ManejadorBD extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="moviles.db";
    private static final String COL_ID="ID";
    private static final String COL_MODELO="MODELO";
    private static final String COL_MARCA="MARCA";
    private static final String COL_PRECIO="PRECIO";
    private static final String TABLE_NAME="MOVILES";

    public ManejadorBD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    //creacion de la base de datos
        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME+"("+
                COL_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"
                +COL_MODELO+" TEXT,"
                +COL_MARCA+" TEXT,"
                +COL_PRECIO+" TEXT"+")");

    }

    //comprobamos los datos antes de insertar
    public boolean insertar(String modelo,String marca,String precio){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_MARCA,marca);
        contentValues.put(COL_MODELO,modelo);
        contentValues.put(COL_PRECIO,precio);

        long resultado=db.insert(TABLE_NAME,null,contentValues);
        db.close();

        return (resultado!=-1);
        

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
