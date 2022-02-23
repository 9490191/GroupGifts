package edu.h22_4m6.group_gifts.utils;

import android.content.Context;
import android.widget.Toast;

/*
 * Created by jadaneau (9490191) on 2022-02-22.
 */
public class Utilities {

    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
