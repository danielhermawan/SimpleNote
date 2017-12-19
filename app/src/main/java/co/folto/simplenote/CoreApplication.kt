package co.folto.simplenote

import android.app.Application
import com.facebook.stetho.Stetho
import net.danlew.android.joda.JodaTimeAndroid
import timber.log.Timber

/**
 * Created by daniel.hermawan on 12/19/17.
 */

class CoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
            Timber.plant(Timber.DebugTree())
        }
        JodaTimeAndroid.init(this);
    }
}