package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*
import com.example.madlevel2task1.databinding.ItemPlaceBinding

//Create a class called PlaceAdapter
class PlaceAdapter (private val places: List<Place>):
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){


    //Add an inner class ViewHolder
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        //In the ViewHolder bind the image and name to the ImageView
        //and TextView using kotlin synthetics
        val binding = ItemPlaceBinding.bind(itemView)
        fun databind(place: Place){
            binding.tvPlace.text = place.name
            binding.ivPlace.setImageResource(place.imageResID)
        }
    }

    //Let the PlaceAdapter extend RecyclerView.ViewHolder and implement the methods.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
       holder.databind((places[position]))
    }

}