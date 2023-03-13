package com.example.dagger2_slack_binds_webinar_soldatenkov

import javax.inject.Inject

class DepImpl  @Inject constructor(): Dep {
//class DepImpl : Dep {

    override fun doSmth() {
        println("YYYYY --> XXXXX ")
    }

/*    fun doSmthText(){
        println("YYYYY --> XXXXX $string")
    }*/

}

interface Dep {
    fun doSmth()
}