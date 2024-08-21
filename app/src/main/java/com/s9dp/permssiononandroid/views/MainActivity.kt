package com.s9dp.permssiononandroid.views

import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.Manifest.permission.READ_MEDIA_IMAGES
import android.Manifest.permission.READ_MEDIA_VIDEO
import android.Manifest.permission.READ_MEDIA_VISUAL_USER_SELECTED
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.s9dp.permssiononandroid.R
import com.s9dp.permssiononandroid.adapters.ItemAdapter
import com.s9dp.permssiononandroid.extentions.hasPermissions
import com.s9dp.permssiononandroid.extentions.showSettingsDialog
import com.s9dp.permssiononandroid.models.Item

class MainActivity : AppCompatActivity() {

    private lateinit var itemAdapter: ItemAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var requestMultiplePermissions: ActivityResultLauncher<Array<String>>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)

        itemAdapter = ItemAdapter(onItemClicked = { itemName, positions ->
            galleryPermission()
        })

        recyclerView.adapter = itemAdapter

        for (items in itemList) {
            itemAdapter.addItem(items)
        }

        requestMultiplePermissions = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissionsResult ->
            val allGranted = permissionsResult.all { it.value }
            if (allGranted) {
                Toast.makeText(this, "Permission has Granted now", Toast.LENGTH_LONG).show()
            } else {
                showSettingsDialog()
            }
        }

    }


    companion object {
        val itemList: MutableList<Item> = mutableListOf(
            Item(1, "Photo Permission"), Item(2, "Video Permission"), Item(3, "Camera Permission")
        )
        val permissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            arrayOf(READ_MEDIA_IMAGES, READ_MEDIA_VIDEO, READ_MEDIA_VISUAL_USER_SELECTED)
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arrayOf(READ_MEDIA_IMAGES, READ_MEDIA_VIDEO)
        } else {
            arrayOf(READ_EXTERNAL_STORAGE)
        }
    }


    private fun galleryPermission() {
        if (hasPermissions(permissions)) {
            Toast.makeText(this, "Permission has already available", Toast.LENGTH_LONG).show()
        } else {
            requestMultiplePermissions.launch(permissions)
        }
    }


}