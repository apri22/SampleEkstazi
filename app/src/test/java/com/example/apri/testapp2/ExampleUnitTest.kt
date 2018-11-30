package com.example.apri.testapp2

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.spy
import com.nhaarman.mockito_kotlin.whenever
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.mockk
import io.mockk.spyk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @InjectMockKs
    lateinit var model: Car

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        //MockitoAnnotations.initMocks(this)
    }

   //@Test
   //fun totalWheel_mockito() {
   //    val model = Car(5)

   //    //whenever(model.totalWheel()).thenReturn(5)

   //    assertEquals(5, model.totalWheel())
   //}

   //@Test
   //fun totalWheel_mockito2() {
   //    val model = Car(2)

   //    //whenever(model.totalWheel()).thenReturn(5)

   //        assertEquals(2, model.totalWheel())
   //}

    @Test
    fun totalWheel_mockk() {
        model = spyk(model)

        every { model.totalWheel() } returns 5

        assertEquals(5, model.totalWheel())
    }
}
