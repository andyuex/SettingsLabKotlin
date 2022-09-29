package es.unex.giiis.asee.settingslabkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceManager

class ContentFragment : Fragment(R.layout.fragment_content) {

    lateinit var textViewUserName: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewUserName = view.findViewById(R.id.textViewUserName)
    }

    override fun onResume() {
        super.onResume()

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val userName = sharedPreferences.getString(SettingsFragment.UserNameKey, "")

        textViewUserName.text = "Hello, $userName!"
    }
}
