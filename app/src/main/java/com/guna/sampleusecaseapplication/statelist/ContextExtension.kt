package com.guna.sampleusecaseapplication.statelist

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.guna.sampleusecaseapplication.R
import com.guna.sampleusecaseapplication.databinding.ProgressBarLayoutBinding

object Dialog {
    var alertDialog: AlertDialog? = null



}

private fun hideScreen() {
    if (Dialog.alertDialog != null) {
        Dialog.alertDialog?.dismiss()
        Dialog.alertDialog = null
    }
}

private fun showProgressBar(context: Context) {
    if(Dialog.alertDialog != null) {
        hideScreen()
    }

    val binding = DataBindingUtil.inflate<ProgressBarLayoutBinding>(
        LayoutInflater.from(context),
        R.layout.progress_bar_layout,
        null,
        false
    )
    Dialog.alertDialog = AlertDialog.Builder(context).apply {
        setView(binding.root)
    }.create().apply { window?.setBackgroundDrawable(ColorDrawable(context.getColor(R.color.transparent))) }

    Dialog.alertDialog?.show()
}

fun Context.CanShowIndicator(canShow: Boolean) = if(canShow) showProgressBar(this) else hideScreen()
