package com.example.dagger2_slack_binds_webinar_soldatenkov

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BindsModule::class])
interface Component {

    fun inject(activity: MainActivity)

}