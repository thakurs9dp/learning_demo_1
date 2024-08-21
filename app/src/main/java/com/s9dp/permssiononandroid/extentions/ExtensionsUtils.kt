package com.s9dp.permssiononandroid.extentions

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Debug
import android.provider.Settings
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.os.BuildCompat
import androidx.fragment.app.Fragment

fun Fragment.hasPermissions(permissions: Array<String>) = permissions.all {
    activity?.let { it1 ->
        ContextCompat.checkSelfPermission(
            it1, it
        )
    } == PackageManager.PERMISSION_GRANTED
}

fun Activity.hasPermissions(permissions: Array<String>) = permissions.all {
    ActivityCompat.checkSelfPermission(
        baseContext, it
    ) == PackageManager.PERMISSION_GRANTED
}


fun Context.showSettingsDialog() {
    AlertDialog.Builder(this).setTitle("Permission Required")
        .setMessage("To access the gallery, please grant the necessary permissions in settings.")
        .setPositiveButton("Go to Settings") { _, _ ->
            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                data = Uri.fromParts("package", packageName, null)
            }
            startActivity(intent)
        }.setNegativeButton("Cancel", null).create().show()
}


fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
