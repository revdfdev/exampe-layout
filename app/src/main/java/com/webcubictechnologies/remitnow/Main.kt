package com.webcubictechnologies.remitnow

import android.app.Application
import android.content.pm.ApplicationInfo
import com.github.ajalt.timberkt.Timber
import io.realm.Realm
import io.realm.RealmConfiguration
import org.koin.Koin
import org.koin.android.ext.android.startKoin
import org.koin.android.logger.AndroidLogger
import java.security.SecureRandom

/**
 * Created by webcubictech2 on 4/1/18.
 */
class Main: Application() {

    override fun onCreate() {
        super.onCreate()
        val key = ByteArray(64)
        SecureRandom().nextBytes(key)
        initLogging()
        Realm.init(this)
        val config = RealmConfiguration.Builder()
                .name("remit-now.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .encryptionKey(key)
                .build()
        //startKoin(this, null)
    }

    fun initLogging() {
        val debug = (0 != applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE)
        if (debug) {
            Timber.plant(timber.log.Timber.DebugTree())
            Koin.logger = AndroidLogger()
        }
    }
}