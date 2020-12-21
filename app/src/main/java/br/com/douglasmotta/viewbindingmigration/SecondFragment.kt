package br.com.douglasmotta.viewbindingmigration

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.douglasmotta.viewbindingmigration.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSecondBinding.bind(view)
        binding.textFragment.text = getString(R.string.second_fragment)
    }
}