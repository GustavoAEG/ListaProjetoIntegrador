package com.gui.listaprojetointegrador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.gui.listaprojetointegrador.model.OrderViewModel
import java.text.SimpleDateFormat
import java.util.*

class TarefaFragment : Fragment() {

    private lateinit var edit_text_time: EditText
    private lateinit var button_salvar: Button

    //private lateinit var buttonSalvar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tarefa, container, false)


        edit_text_time = view.findViewById<EditText>(R.id.editTextTime)
        button_salvar = view.findViewById<Button>(R.id.buttonSalvar)

        button_salvar.setOnClickListener{
            validarTarefa()
        }
  

        return view
    }

    private fun validarTarefa(): Boolean {

        var error = false

        if (edit_text_time.text.isEmpty()) {
            edit_text_time.error = "Informe a hora"
            error = true
        }
        return error
    }
}