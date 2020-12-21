package br.com.douglasmotta.viewbindingmigration

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FirstFragmentInstrumentedTest {

    @Test fun shouldDisplayFragmentName() {
        launchFragmentInContainer<FirstFragment>()

        onView(withId(R.id.text_fragment)).check(matches(isDisplayed()))
    }
}