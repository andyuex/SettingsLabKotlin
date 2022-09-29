package es.unex.giiis.asee.settingslabkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Set preferences' default values

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, ContentFragment())
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuSettings -> {
                // TODO Display the settings fragment as the main content

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
