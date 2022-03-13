package kr.co.smartsoft.viewpager_fragment_20220218

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.smartsoft.viewpager_fragment_20220218.adapters.MainViewPagerAdapter

class MainActivity : AppCompatActivity() {
    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    fun setUpEvents() {

    }

    fun setValues() {

        // MainViewPagerAdapter 룰 구현
        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mAdapter
    }
}