package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.btnGitA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)
        }

        binding.btnGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }
        return binding.root
    }

}