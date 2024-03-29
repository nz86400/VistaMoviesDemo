package me.li2.movies.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import me.li2.movies.App
import me.li2.movies.data.repository.Repository
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

open class BaseViewModel :
        ViewModel(),
        LifecycleObserver,
        KodeinAware {

    final override val kodein by kodein(App.context)

    val repository: Repository by instance()
}
