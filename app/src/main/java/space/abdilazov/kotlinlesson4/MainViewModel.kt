package space.abdilazov.kotlinlesson4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var mCounter = 0
    private var plus = "+"
    private var minus = "-"

    var counter = MutableLiveData<Int>()
    var logika = MutableLiveData<String>()

    fun onIncrementClick(){
        mCounter++
        counter.value = mCounter
        logika.value = plus
    }
    fun onItemClickMinus(){
        mCounter--
        counter.value = mCounter
        logika.value = minus
    }
}