package com.example.dagger2_slack_binds_webinar_soldatenkov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dep: Dep

    @Inject
    lateinit var rep: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerComponent.create().inject(this)

        dep.doSmth()

        (rep as RepositoryImpl).doR()
    }
}