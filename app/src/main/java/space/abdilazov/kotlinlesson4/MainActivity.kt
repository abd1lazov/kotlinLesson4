package space.abdilazov.kotlinlesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
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
                ThirdFragment()
        )
        val viewPager2 = ViewPagerAdapter(fragments,this)
        binding.ViewPager2.adapter = viewPager2
        }
    }

//Добавить ViewPager из 3 фрагментов в MainActivity
//- 1 фрагмент кнопки ‘+’ и ‘-’, при нажатии вызывать соответствующие методы у ViewModel и выполнять необходимую логику
//- 2 фрагмент отображает текущее значение LiveData счетчика
//- 3 фрагмент отображает список выполненных операций (просто список строковых значений, который наблюдаются у ViewModel-a)
//- Для всех задач использовать один ViewModel



