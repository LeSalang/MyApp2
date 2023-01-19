package kz.lesa.genetics

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kz.lesa.genetics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for ((index, grade) in gradeArray.withIndex()) {
            when (grade) {
                in bad -> badArray.add("Плохие оценки: ${nameArray[index]} $grade")
                in normal -> normalArray.add(nameArray[index])
                in nice -> niceArray.add(nameArray[index])
                excellent -> excellentArray.add(nameArray[index])
            }
        }
        badArray.forEach{Log.d("MyLog","$it")}

        val user = User ("Rod", "00d", 24)

    }
}