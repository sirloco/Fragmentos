package com.example.fragmentos


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragmento2.*
import kotlin.ClassCastException

/**
 * A simple [Fragment] subclass.
 */
class fragmento2 : Fragment() {

    interface ComunicaMenu {
        public fun menu (botonPulsado: Int)
    }

    lateinit var miactividad:ComunicaMenu

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {
            miactividad = context as ComunicaMenu
        }catch (e:ClassCastException){
            throw   ClassCastException (context?.toString())
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bAgretsuko.setOnClickListener{ miactividad.menu(1)}
        bArale.setOnClickListener { miactividad.menu(2) }
        bTotoro.setOnClickListener { miactividad.menu(3)}
    }




}
