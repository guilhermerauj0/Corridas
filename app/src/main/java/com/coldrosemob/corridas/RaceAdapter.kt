package com.coldrosemob.corridas

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RaceAdapter(private var raceList: List<Race>) : RecyclerView.Adapter<RaceAdapter.RaceViewHolder>() {

    inner class RaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val raceVehicle : TextView = itemView.findViewById(R.id.raceVehicle)
        val raceDate : TextView = itemView.findViewById(R.id.raceDate)
        val racePrice : TextView = itemView.findViewById(R.id.racePrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.race_info, parent, false)
        return RaceViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RaceViewHolder, position: Int) {
        holder.raceVehicle.text = raceList[position].vehicle
        holder.raceDate.text = raceList[position].date
        holder.racePrice.text = "R$${raceList[position].price}"
    }

    override fun getItemCount(): Int = raceList.size
}

