package space.abdilazov.kotlinlesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import space.abdilazov.fragments.FirstFragment
import space.abdilazov.fragments.SecondFragment
import space.abdilazov.fragments.ThirdFragment
import space.abdilazov.kotlinlesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments:ArrayList<Fragment> = arrayListOf(
                FirstFragment(),
                SecondFragment(),
                ThirdFragment())

        val viewPager2 = ViewPagerAdapter(fragments,this)
        binding.ViewPager2.adapter = viewPager2
        }
    }