package com.example.interaface.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.interaface.R
import android.util.Log
import com.example.interaface.model.ApiTokenDAO
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DynamicButtonsActivity : AppCompatActivity() {

    private lateinit var dao : ApiTokenDAO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_buttons)
        dao = ApiTokenDAO(applicationContext)
        val token : String? = dao.getToken()
        val service = secondRequest.apiService
        GlobalScope.launch {
            val response = service.fetchWaterPermissions(token)
            Log.i("GETTOKEN", "o json porra: ${response.body()}")
        }
    }
}

