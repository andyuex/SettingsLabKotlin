package es.unex.giiis.asee.settingslabkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class ContentFragment : Fragment(R.layout.fragment_content) {

    lateinit var textViewUserName: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewUserName = view.findViewById(R.id.textViewUserName)
    }

    override fun onResume() {
        super.onResume()

        val userName = ""

        // TODO Get the user name from the preferences

        textViewUserName.text = "Hello, $userName!"
    }
}
