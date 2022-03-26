package com.mira.studentsviewa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class RegistroActivity : AppCompatActivity() {

    var campoDocumento:EditText?=null
    var campoNombre:EditText?=null
    var campoEdad:EditText?=null
    var campoTelefono:EditText?=null
    var campoDireccion:EditText?=null

    var campoMateria1: EditText?=null
    var campoMateria2:EditText?=null
    var campoMateria3:EditText?=null
    var campoMateria4:EditText?=null
    var campoMateria5:EditText?=null
    var campoNota1:EditText?=null
    var campoNota2:EditText?=null
    var campoNota3:EditText?=null
    var campoNota4:EditText?=null
    var campoNota5:EditText?=null

    var operaciones:Operaciones?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        iniciarComponentes()
    }

    private fun iniciarComponentes() {
        operaciones= Operaciones()

        campoNombre=findViewById(R.id.campoNombre)
        campoDireccion=findViewById(R.id.campoDireccion)
        campoEdad=findViewById(R.id.campoEdad)
        campoTelefono=findViewById(R.id.campoTelefono)
        campoDocumento=findViewById(R.id.campoDocumento)

        campoMateria1=findViewById(R.id.campMateria1)
        campoMateria2=findViewById(R.id.campMateria2)
        campoMateria3=findViewById(R.id.campMateria3)
        campoMateria4=findViewById(R.id.campMateria4)
        campoMateria5=findViewById(R.id.campMateria5)

        campoNota1=findViewById(R.id.campProm1)
        campoNota2=findViewById(R.id.campProm2)
        campoNota3=findViewById(R.id.campProm3)
        campoNota4=findViewById(R.id.campProm4)
        campoNota5=findViewById(R.id.campProm5)

        var btnRegistro:Button=findViewById(R.id.btnRegistrar)
        btnRegistro.setOnClickListener { registrarEstudiante() }

    }

}
}