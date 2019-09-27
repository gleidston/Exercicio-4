package com.www.calcularcombustivel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularpreco(view: View) {
        // recuperar valores digitados pelo usuario
        //val precoAlcool = findViewById<editText>(R.id.editPrecoAlcool)


        val precoAlcool = editPrecoAlcool.text.toString()
        val precoGasolina = editPrecoGasolina.text.toString()
        val validacampos = ValidarCampos(precoAlcool, precoGasolina)

        if (validacampos)
            calcularMelhorPreco(precoAlcool, precoGasolina)

    }
    fun calcularMelhorPreco (precoAcool: String, precoGasolina: String) {

       // converter valores em string para numeros inteiros ou fracionarios
        val valorAcool = precoAcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()
        val resultadoPreco = valorAcool/ valorGasolina
     if (resultadoPreco >= 0.7 ){
         textView2.text= "Mlehor ultilizar gasolina  !"
        } else {
         textView2.text= "Mlehor ultilizar Álcool ! "
        }
    }
    fun ValidarCampos(precoAcool: String, precoGasolina: String) : Boolean {

        var CamposValidado: Boolean = true
     if (precoAcool == null || precoAcool.equals("")) {
            CamposValidado = false

        } else if (precoGasolina == null || precoGasolina.equals("")) {
            CamposValidado = false
        }
            return CamposValidado
        }
}