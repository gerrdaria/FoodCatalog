package com.example.foodcatalog

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
        const val EXTRA_CATEGORY = "EXTRA_CATEGORY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: экран категорий создан")
        val btnBreakfast = findViewById<Button>(R.id.btnBreakfast)
        val btnMainDishes = findViewById<Button>(R.id.btnMainDishes)
        val btnDesserts = findViewById<Button>(R.id.btnDesserts)
        val btnDrinks = findViewById<Button>(R.id.btnDrinks)

        btnBreakfast.setOnClickListener{
            openCategory(getString(R.string.category_breakfast))
        }

        btnMainDishes.setOnClickListener{
            openCategory(getString(R.string.category_main_dishes))
        }

        btnDesserts.setOnClickListener {
            openCategory(getString(R.string.category_desserts))
        }

        btnDrinks.setOnClickListener {
            openCategory(getString(R.string.category_drinks))
        }
    }

    private fun openCategory(category: String) {
        Log.i(TAG, "Выбрана категория: $category")

        val intent = Intent(this, DishListActivity::class.java)
        intent.putExtra(EXTRA_CATEGORY, category)
        startActivity(intent)
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