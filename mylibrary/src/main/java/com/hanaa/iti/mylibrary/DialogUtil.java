package com.hanaa.iti.mylibrary;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogUtil {
    public static void showDialog(Context context, String title, String message ,String positiveMsg, DialogInterface.OnClickListener listener){
        Dialog dialog=new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(R.string.num)
                .setPositiveButton(positiveMsg,listener).create();
        dialog.show();


    }
}
