package space.abdilazov.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.abdilazov.kotlinlesson4.databinding.ItemkaBinding

class RvAdapter (private var llogic:ArrayList<String>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    private lateinit var binding: ItemkaBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ItemkaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: RvAdapter.ViewHolder, position: Int) {
        holder.onBind(llogic[position])
    }

    override fun getItemCount(): Int {
        return llogic.size
    }

   class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       private val binding = ItemkaBinding.bind(itemView)
       fun onBind(A: String) {

           binding.tvSpisok.text = A

       }
   }
}