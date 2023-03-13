package com.example.dagger2_slack_binds_webinar_soldatenkov

import javax.inject.Inject

//class RepositoryImpl @Inject constructor(private val dep: Dep) : Repository {
class RepositoryImpl @Inject constructor(private val dep: Dep) : Repository {
    fun doR(){
        println("RepositoryImpl")
//        dep.doSmth()
    }
}

interface Repository {
}