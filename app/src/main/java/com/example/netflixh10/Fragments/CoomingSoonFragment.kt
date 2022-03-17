package com.example.netflixh10.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.netflixh10.R
import com.example.netflixh10.databinding.FragmentCoomingSoonBinding
import com.example.netflixh10.databinding.FragmentHomeBinding
import android.content.Intent




class CoomingSoonFragment : Fragment(R.layout.fragment_cooming_soon){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
        var shareMessage = ""
        shareMessage = """
           SSSSSSSSSpider MMMMMMMan
            
            """.trimIndent()
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
        val binding = FragmentCoomingSoonBinding.bind(view)
        binding.apply {
            share.setOnClickListener {
                startActivity(Intent.createChooser(shareIntent, "choose one"));
            }
        }
    }
}