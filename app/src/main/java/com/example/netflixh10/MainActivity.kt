package com.example.netflixh10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.netflixh10.Fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val profileFragment = ProfileFragment()
    private val favoriteFragment = FavoriteFragment()
    private val homeFragment = HomeFragment()
    private val comingSoonFragment = CoomingSoonFragment()
    private val loginFragment = LoginFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)
        bottomNavigationItemSelect()

    }

      fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
    private fun bottomNavigationItemSelect() {
        val bottomNavigatonView: BottomNavigationView = findViewById(R.id.bottomNavigatonView)
        bottomNavigatonView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.miFavorite -> replaceFragment(favoriteFragment)
                R.id.miComingsoon -> replaceFragment(comingSoonFragment)
                R.id.miProfile -> replaceFragment(profileFragment)
                R.id.miHome -> replaceFragment(homeFragment)
            }
            true
        }
    }

}