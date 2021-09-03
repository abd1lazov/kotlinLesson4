package space.abdilazov.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.abdilazov.kotlinlesson4.databinding.ItemkaBinding

class MyAdapter(private val fragments: ArrayList<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private lateinit var binding: ItemkaBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemkaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fragments[position])
    }

    override fun getItemCount(): Int {
        return fragments.size
    }
    fun addItems(fragment: String){
        fragments.add(fragment)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding: ItemkaBinding = ItemkaBinding.bind(itemView)
        fun bind(s: String) {
            binding.tvSpisok.text = s
        }
    }
}