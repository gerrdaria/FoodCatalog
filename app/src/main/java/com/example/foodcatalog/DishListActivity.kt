package com.example.foodcatalog

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DishListActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "DishListActivity"
        const val EXTRA_DISH = "EXTRA_DISH"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_list)

        Log.d(TAG, "onCreate: экран списка блюд создан")

        val tvCategoryTitle = findViewById<TextView>(R.id.tvCategoryTitle)

        val btnDish1 = findViewById<Button>(R.id.btnDish1)
        val btnDish2 = findViewById<Button>(R.id.btnDish2)
        val btnDish3 = findViewById<Button>(R.id.btnDish3)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val category = intent.getStringExtra(MainActivity.EXTRA_CATEGORY) ?: ""

        tvCategoryTitle.text = category

        when (category) {

            getString(R.string.category_breakfast) -> {
                btnDish1.text = getString(R.string.breakfast_1)
                btnDish2.text = getString(R.string.breakfast_2)
                btnDish3.text = getString(R.string.breakfast_3)
            }

            getString(R.string.category_main_dishes) -> {
                btnDish1.text = getString(R.string.main_dish_1)
                btnDish2.text = getString(R.string.main_dish_2)
                btnDish3.text = getString(R.string.main_dish_3)
            }

            getString(R.string.category_desserts) -> {
                btnDish1.text = getString(R.string.dessert_1)
                btnDish2.text = getString(R.string.dessert_2)
                btnDish3.text = getString(R.string.dessert_3)
            }

            getString(R.string.category_drinks) -> {
                btnDish1.text = getString(R.string.drink_1)
                btnDish2.text = getString(R.string.drink_2)
                btnDish3.text = getString(R.string.drink_3)
            }
        }

        btnDish1.setOnClickListener {
            openDish(btnDish1.text.toString())
        }

        btnDish2.setOnClickListener {
            openDish(btnDish2.text.toString())
        }

        btnDish3.setOnClickListener {
            openDish(btnDish3.text.toString())
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun openDish(dish: String) {

        Log.i(TAG, "Выбрано блюдо: $dish")

        val intent = Intent(this, DishDetailActivity::class.java)

        intent.putExtra(EXTRA_DISH, dish)

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