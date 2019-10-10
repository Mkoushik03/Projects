package com.example.dark_ninja.passwordmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class PMDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "STUDENT.db";
    private static final String TABLE_NAME = "STUDENT";
    private static final String ID = "_id";
    private static final String uname = "Username";
    private static final String pass = "Password";
    private static final String Sec_quest = "SecurityQuestion";
    private static final String Sec_ans = "Answer";

    private static final int VERSION_NUMBER = 1;


    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT DEFAULT 1, " + uname + " VARCHAR(200) UNIQUE DEFAULT 'koushik' , " + pass + " VARCHAR(20) DEFAULT 'km' , " + Sec_quest + " VARCHAR(200) DEFAULT 'Whats my IGN' , " + Sec_ans + " VARCHAR(200) DEFAULT 'dark_ninja' )  ;";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    private Context context;


    public PMDatabase(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {
            Toast.makeText(context, "Database Created", Toast.LENGTH_LONG).show();
            db.execSQL(CREATE_TABLE);


        } catch (Exception e) {
            Toast.makeText(context, "Exception : " + e, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        try {
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Toast.makeText(context, "", Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            Toast.makeText(context, "Exception : " + e, Toast.LENGTH_LONG).show();

        }

    }

    public long insertdata(Userdetails userdetails) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put(uname, userdetails.getUsername());
        c.put(pass, userdetails.getPass());
        c.put(Sec_quest, userdetails.getSecurityques());
        c.put(Sec_ans, userdetails.getAnswer());
        long rowid = db.insert(TABLE_NAME, null, c);

        return rowid;
    }

    public boolean findpassword(String users, String PAss) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cr = db.rawQuery("SELECT * FROM " + TABLE_NAME + " ", null);
        boolean result = false;
        if (cr.getCount() == 0) {
            Toast.makeText(context, "No data", Toast.LENGTH_LONG).show();
        } else {
            while (cr.moveToNext()) {
                String usernam = cr.getString(1);
                String passwo = cr.getString(2);

                if (usernam.equals(users) && passwo.equals(PAss)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }


    public Cursor forgotp(String email) {


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cr = db.rawQuery("SELECT * FROM " + TABLE_NAME + " where Username='"+email+"'  ", null);

        return cr;
    }

    public void createtab(String a) {
        String createtable = "CREATE TABLE IF NOT EXISTS "+a+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, Username VARCHAR(200) NOT NULL, Password VARCHAR(20), Email VARCHAR(200), Account_Title VARCHAR(200) NOT NULL ) ;";

        SQLiteDatabase dc = this.getWritableDatabase();
        dc.execSQL(createtable);

    }

    public long addnew(Addpass addpass,String k) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("Username", addpass.getNewuser());
        c.put("Password", addpass.getNewpassword());
        c.put("Email", addpass.getNewemail());
        c.put("Account_Title", addpass.getNewaccounttitle());
        long rowid1 = db.insert(k, null, c);

        return rowid1;
    }

    public Cursor showdata(String j,String k)
    {
        SQLiteDatabase de = this.getWritableDatabase();
        Cursor curs = de.rawQuery("SELECT * FROM "+j+" where Username='"+k+"' OR Account_Title='"+k+"' ",null);

        return curs;
    }

    public boolean srcupdate(String tabLe,String userName,String Passw,String emaIl,String id)
    {

        SQLiteDatabase dr = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("Username", userName);
        c.put("Password", Passw);
        c.put("Email", emaIl);

        dr.update(tabLe,c,"ID = ?", new String[] { id });
        return true;
    }



}