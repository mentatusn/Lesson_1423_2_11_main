package ru.geekbrains.lesson_1423_2_11_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // findViewById<TextView>(R.id.textView).text =  "Здравствуйте company2"
        when(getString(R.string.app_name)){
            "PRO 18+ content"->{
            }
            "PRO 3+ content"-> {
            }
        }
        /*val soldier = Soldier()
        soldier.instrument = Shovels.ShovelWide()
        soldier.instrument?.excavate()
        soldier.instrument = Shovels.ShovelThin()
        soldier.instrument?.excavate()*/
    }
}

open class Soldier(){
    var instrument: Shovel? =null
}
sealed class Shovels{
    class ShovelWide():Shovel(){
        override fun excavate() {
            TODO("Not yet implemented")
        }
    }
    class ShovelThin():Shovel(){
        override fun excavate() {
            TODO("Not yet implemented")
        }
    }
}

abstract class Shovel(){
    abstract fun excavate()
}


/*
class newClass():Paintable{

    override fun paint() {
        TODO("Not yet implemented")
    }

    override fun paintGrass() {
        TODO("Not yet implemented")
    }

    override fun paintTheBorder() {
        TODO("Not yet implemented")
    }

    override fun paintTheWall() {
        TODO("Not yet implemented")
    }

}

// так расширять - можно
open class Soldier2(): Soldier(){
    fun chooseDirectionGeneral(){
        //TODO v_2_0 оттуда до сюда
    }
}
// так расширять - можно
interface GeneralDirectionChooseable{
    fun chooseDirectionGeneral(){
        //TODO v_2_0 оттуда до сюда
    }
    fun excavate()
    fun paint()
    fun paintGrass()
    fun paintTheBorder()
    fun paintTheWall()
}

interface Paintable{
    fun paint()
    fun paintGrass()
    fun paintTheBorder()
    fun paintTheWall()
}

/* Божественный солдат*/
open class Soldier(){
    fun introduce(){}
    fun chooseDirection(){
        // а вот здесь модифицировать нельзя
        //TODO v_1_0 отсюда до туда
    }
    fun excavate(){}
    fun paint(){}
    fun paintGrass(){}
    fun paintTheBorder(){}
    fun paintTheWall(){}
}
*/


/*
Плохой подход
open class Soldier(){

}

open class SoldierWithInstrument():Soldier(){

}

open class SoldierWithInstrumentShovel():SoldierWithInstrument(){

}
open class SoldierWithInstrumentShovelThin():SoldierWithInstrumentShovel(){

}*/

// Хороший подход
/*open class Soldier(){
    var instruments: Instruments? =null
}
sealed class Instruments{
    class Shovel():Instruments()
    class Brush():Instruments()
}*/