package com.kd.simplenotelib

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class ShowNote {

    companion object {
        fun asToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        fun asSnackBar(view: View, msg: String) {
            Snackbar.make(view, msg, 1333).show()
        }
    }
}