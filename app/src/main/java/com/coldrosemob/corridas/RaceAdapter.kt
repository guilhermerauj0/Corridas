package com.coldrosemob.corridas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RaceAdapter(private val raceList: List<Race>) : RecyclerView.Adapter<RaceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.race_info, parent, false)
        return RaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: RaceViewHolder, position: Int) {
        holder.itemView.apply {
            race_vehicle.text = raceList[position].vehicle
        }
    }

    override fun getItemCount(): Int = raceList.size
}