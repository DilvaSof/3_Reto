package com.example.a3_reto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ExampleDetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_example_edit, container, false)
        setupNavigation (root)
        return root

    }

    private fun setupNavigation(root: View) {
        val nextbutton = root.findViewById<Button>(R.id.buttonNext)
        nextbutton.setOnClickListener { view:View ->
            view.findNavController().navigate(R.id.action_list_to_detail)
        }

    }
}
