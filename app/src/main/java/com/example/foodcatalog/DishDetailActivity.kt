package com.example.foodcatalog

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DishDetailActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "DishDetailActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_detail)

        Log.d(TAG, "onCreate: экран блюда создан")

        val tvDishName = findViewById<TextView>(R.id.tvDishName)
        val tvDishInfo = findViewById<TextView>(R.id.tvDishInfo)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val dish = intent.getStringExtra(DishListActivity.EXTRA_DISH) ?: ""

        tvDishName.text = dish

        tvDishInfo.text = when (dish) {

            getString(R.string.breakfast_1) ->
                getString(R.string.info_syrniki)

            getString(R.string.breakfast_2) ->
                getString(R.string.info_omelet)

            getString(R.string.breakfast_3) ->
                getString(R.string.info_oatmeal)

            getString(R.string.main_dish_1) ->
                getString(R.string.info_carbonara)

            getString(R.string.main_dish_2) ->
                getString(R.string.info_chicken_rice)

            getString(R.string.main_dish_3) ->
                getString(R.string.info_lasagna)

            getString(R.string.dessert_1) ->
                getString(R.string.info_cheesecake)

            getString(R.string.dessert_2) ->
                getString(R.string.info_tiramisu)

            getString(R.string.dessert_3) ->
                getString(R.string.info_brownie)

            getString(R.string.drink_1) ->
                getString(R.string.info_cappuccino)

            getString(R.string.drink_2) ->
                getString(R.string.info_lemonade)

            getString(R.string.drink_3) ->
                getString(R.string.info_cocoa)

            else ->
                getString(R.string.default_dish_info)
        }

        btnBack.setOnClickListener {
            Log.i(TAG, "Нажата кнопка Назад")
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}