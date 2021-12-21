package dev.tsnanh.android.template.app

import android.app.Application
import dev.tsnanh.android.navigation.DaggerNavigationComponent
import dev.tsnanh.android.template.BuildConfig
import dev.tsnanh.android.template.di.AppProvider
import dev.tsnanh.android.template.di.DaggerAppComponent
import timber.log.Timber

// TODO: Rename to your application name
open class YourApplication : Application() {
    val appProvider: AppProvider by lazy {
        initializeProvider()
    }

    open fun initializeProvider(): AppProvider {
        // Create an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        val navigationProvider = DaggerNavigationComponent.factory().create(this)
        return DaggerAppComponent.builder()
            .navigationProvider(navigationProvider)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}

val Application.appProvider: AppProvider
    get() = (this as YourApplication).appProvider
