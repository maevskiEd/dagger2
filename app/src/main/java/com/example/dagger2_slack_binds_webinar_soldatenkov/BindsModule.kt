package com.example.dagger2_slack_binds_webinar_soldatenkov

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class BindsModule {
    @Binds
    @Singleton
    abstract fun bindDep(depImpl: DepImpl): Dep

    @Binds
    @Singleton
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}
