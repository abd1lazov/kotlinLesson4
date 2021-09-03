package space.abdilazov.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import space.abdilazov.kotlinlesson4.MainViewModel
import space.abdilazov.kotlinlesson4.R
import space.abdilazov.kotlinlesson4.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private var myAdapter: MyAdapter? = null
    private var list: ArrayList<String> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.logika.observe(viewLifecycleOwner,{ commands->
            myAdapter?.addItems(commands.toString())
        })
        
        myAdapter = MyAdapter(list)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = myAdapter
        }
    }
}