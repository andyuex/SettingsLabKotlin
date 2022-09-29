package es.unex.giiis.asee.settingslabkotlin

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment : PreferenceFragmentCompat() {

    companion object {
        const val NightModeKey = "NightModeKey"
        const val UserNameKey = "UserNameKey"
    }
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        // TODO Load the preferences from an XML resource
    }
}
