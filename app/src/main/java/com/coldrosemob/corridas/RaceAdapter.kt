package com.coldrosemob.corridas

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.coldrosemob.corridas.databinding.RaceInfoBinding

class RaceAdapter(private var raceList: List<Race>) : RecyclerView.Adapter<RaceAdapter.RaceViewHolder>() {

    inner class RaceViewHolder(val binding : RaceInfoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RaceViewHolder {
        val view = LayoutInflater.from(parent.context)
        val binding = RaceInfoBinding.inflate(view, parent, false)
        return RaceViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RaceViewHolder, position: Int) {
        holder.binding.apply {
            raceVehicle.text = raceList[position].vehicle
            raceDate.text = raceList[position].date
            racePrice.text = "R$${raceList[position].price}"
        }
    }

    override fun getItemCount(): Int = raceList.size
}

