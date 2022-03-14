package kr.co.smartsoft.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.smartsoft.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 3
//        총 몇 페이지의 뷰페이저인지 숫자를 알려달라.

    override fun getItem(position: Int): Fragment {
//        각각의 position에 맞는 프래그먼트 객체가 결과로 나가도록 리턴.

        return when (position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> HelloFragment()
        }
    }
}