package com.example.arraysmaphashmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //metodoArray()
        //metodoMap()
        metodoHashMap()
    }

    fun metodoArray(){
        //Hablaremos de array integer
        //inicializamos la array entera
        val intA = intArrayOf(1,4,22,48,120,331)
        println("Mostramos el valor que tiene la posicion 0: "+intA[0])
        //asignamos un nuevo valor a la posicion 0
        intA[0]= 8
        println("Mostrar el nuevo valor asignado a la posicion 0: "+intA[0])
        println(intA.size)

        //arrays booleana (tiene dos valores true o false)
        val booleanA = booleanArrayOf(true,false,true,false,true)
        println(booleanA[3])
        booleanA[3]=true
        println(booleanA[3])

        val doubleA = DoubleArray(3){10.0}
        println("El valor que tiene la arrays doble en su posicion 1"+doubleA[1])

        val StringA = arrayOf("Andres","Cristian","Dayana","Dennis","Edgar")
        println("Nombre: "+StringA[0])

        for(i in StringA){
            println(i)
        }

        val nombre = "Noe"
        val apellido = "Monge"
        val estudiante = "Informatica"
        val edad = "23"

        //Creacion de una array
        val miArray = arrayListOf<String>()

        //añadimos los valore que va a contener
        miArray.add(nombre)
        miArray.add(apellido)
        miArray.add(estudiante)
        miArray.add(edad)

        println(miArray)

        //añadir un conjunto de datos a la arrays
        miArray.addAll(listOf("Programacion IV", "UNAB"))
        println(miArray)

        //modicacion de datos
        miArray[5] = "Universidad Dr. Andres Bello"
        println(miArray)

        //Eliminando datos
        miArray.removeAt(4)
        println(miArray)

        //recorrido de la array por medio de un forEach
        miArray.forEach {
            println(it)
        }

        //otras operaciones
        println(miArray.count())
        println(miArray.clear())
        println(miArray.count())




    }

    //los maps o diccionarios
    fun metodoMap(){
        //sintaxis

        var miMap:Map<String,Int> =  mapOf()
        println(miMap)

        //añadir elementos en la array
        miMap = mutableMapOf("Kevin" to 1,"Laura" to 2, "Mauricio" to 5)
        println(miMap)

        //añadir un solo valor
        miMap["Rafael"] = 7
        miMap.put("Yesenia",8)
        println(miMap)

        //actualizar un dato
        miMap.put("Oscar",1)
        miMap.put("Oscar", 4)
        println(miMap)

        //acceso a datos
        println(miMap["Oscar"])

        //eliminar datos
        miMap.remove("Oscar")
        println(miMap)

    }

    fun metodoHashMap(){
        val nombre = "Noe"
        val apellido = "Monge"
        val estudiante = "Informatica"
        val edad = "23"

        //creacion de HashMap
        // un HashMap es una estructura de datos que se almacenan,
        //en un listado de claves y su respectivo valor
        val miHashMap = HashMap<Int,String>()
        miHashMap[1]=nombre
        miHashMap[2] = apellido
        miHashMap[3]=estudiante
        miHashMap[4] = edad

        val miHM = miHashMap[1]
        println(miHM)
    }
}