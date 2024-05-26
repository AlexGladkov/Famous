package tech.mobiledeveloper.features.profile.presentation.models

sealed class ProfileEvent {
    class TabSelected(val selectedIndex: Int) : ProfileEvent()
}