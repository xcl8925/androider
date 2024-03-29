package com.xie.android

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.xie.android.dagger.injector.component.DaggerAppComponent
import com.xie.android.dagger.injector.component.DaggerSizeComponent
import com.xie.android.dagger.injector.module.ApplicationModule
import com.xie.android.dagger.model.Car
import com.xie.android.dagger.model.Oil
import com.xie.android.dagger.model.Seat
import com.xie.android.dagger.model.Size
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var app: App

    @Inject
    lateinit var seat: Seat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        //dagger
        Car().seat.seat()

        init()

        app.applicationContext
    }

    private fun init() {
        //dagger
        DaggerAppComponent.builder().applicationModule(ApplicationModule()).build().inject(this)

//        DaggerSizeComponent.create().inject(Size())
        DaggerSizeComponent.builder().applicationModule(ApplicationModule()).build().inject(Size())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
