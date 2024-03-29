package com.example.greeting.ui.theme.viewholders

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.greeting.R


class LocationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    private val latitudeTextView: TextView = view.findViewById(R.id.latitudeTextView)
    private val longitudeTextView: TextView = view.findViewById(R.id.longitudeTextView)

    fun bind(location: com.example.greeting.data.Location) {
        nameTextView.text = location.name
        latitudeTextView.text = location.latitude.toString()
        longitudeTextView.text = location.longitude.toString()
    }
}
