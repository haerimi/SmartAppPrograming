package skh.mjc.recyclerviewex01_1103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import skh.mjc.recyclerviewex01_1103.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun loadData(): MutableList<Memo> {
        val data: MutableList<Memo> = mutableListOf()
        for(no in 1..100) {
            val title = "이것이 안드로이드다 ${no}"
            val date = System.currentTimeMillis()
            val memo = Memo(no, title, date)
            data.add(memo)
        }
        return data
    }
}