package com.example.studyapp

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

class AlertDialog(context: Context, title: String, text: String) {
    init {
        val dialogBuilder = AlertDialog.Builder(context)
        dialogBuilder.setMessage(text)
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id -> dialog.cancel() })
        val alert = dialogBuilder.create()
        alert.setTitle(title)
        alert.show()
    }
}