package me.li2.movies.di

import im.ene.toro.exoplayer.ExoCreator
import me.li2.movies.data.local.DBDataSource
import me.li2.movies.data.remote.RemoteDataSource
import me.li2.movies.data.repository.Repository
import me.li2.movies.util.Constants
import me.li2.movies.util.video.VideoPlayerFactory
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

object MainComponent {

    val appModule = Kodein.Module("app module") {
        bind<Constants>() with singleton { Constants(instance()) }
        bind<Repository>() with provider { Repository() }
        bind<RemoteDataSource>() with provider { RemoteDataSource() }
        bind<DBDataSource>() with provider { DBDataSource() }
        bind<ExoCreator>() with singleton { VideoPlayerFactory(instance()).exoCreator }
    }
}
