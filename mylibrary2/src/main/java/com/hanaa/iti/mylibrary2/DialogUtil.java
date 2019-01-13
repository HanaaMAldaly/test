package com.hanaa.iti.mylibrary2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogUtil {
    public static void showDialog(Context context, String title, String message ,String positiveMsg, DialogInterface.OnClickListener listener){
        Dialog dialog=new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(positiveMsg,listener).create();
        dialog.show();

    }
}
