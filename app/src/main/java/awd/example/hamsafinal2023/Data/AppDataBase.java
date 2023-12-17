package awd.example.hamsafinal2023.Data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import awd.example.hamsafinal2023.Data.engLetters.LettersUtil;
import awd.example.hamsafinal2023.Data.engLetters.LettersQuery;
import awd.example.hamsafinal2023.Data.expressions.Expressions;
import awd.example.hamsafinal2023.Data.expressions.ExpressionsQuery;
import awd.example.hamsafinal2023.Data.myUser.MyUser;
import awd.example.hamsafinal2023.Data.myUser.Myuserquery;
import awd.example.hamsafinal2023.Data.numbers.NumberUtil;
import awd.example.hamsafinal2023.Data.numbers.NumbersQuery;

/*
 تعريف الجداول ورقم النسخة(version)
 عند تغير أي شيء يخص جدول أو جداول علينا تغيير رقم الاصدار
 ليتم بناء قاعدة البيانات من جديد
 */
@Database(entities = {MyUser.class, LettersUtil.class, NumberUtil.class, Expressions.class},version = 1)

/**
 * الفئة المسؤولة عن بناء قاعدة البيانات في كل جداولها
 * وتوفر لنا كائن للتعامل مع قاعدة البيانات
 */

public abstract class AppDataBase extends RoomDatabase
{
    /**
     * كائن للتعامل مع قاعدة البيانات
     */
    private static AppDataBase db;

    /**
     * يعيد كائن لعمليات جدول المستعملين
     *
     * @return
     */

    public abstract Myuserquery getMyuserquery();

    /**
     * يعيد كائن
     */

    public abstract ExpressionsQuery getExpressionsquery();

    /**
     *
     */

    public abstract LettersQuery getlettersquery();

    /**
     *
     */

    public abstract NumbersQuery getNumbersQuery();


    /**
     * بناء قاعدة البيانات واعادة كائن يؤشر عليها
     *
     * @param context
     * @return
     */

    public static AppDataBase getDB(Context context) {
        if (db == null) {
            db = Room.databaseBuilder(context,
                            AppDataBase.class, "Hamsadatabase")//اسم قاعدة البيانات
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();


        }
        return db;
    }
}