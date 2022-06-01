package com.in28Minutes.mockito.mockito_demo;

//import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//It scans for Mocks using annotations and injects them where necessary
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessTest {

    @Mock//Defines that this is a mock to be used with testing
    DataService dataServiceMock;

    @InjectMocks//This is where we should inject our mocks
    SomeBusinessImpl businessImpl;


    @Test
    public void testFindTheGreatestFromFiveData(){
        //DataService dataServicemcok = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{68,125,5,23,45});
        //SomeBusinessImpl business = new SomeBusinessImpl(dataServicemcok);
        int result = business.findTheGraatestFromAllData();
        assertEquals(125,result);
    }
}

//-> This is called a stub(Its a class made to he\lp the test class by implementing units neing tested
//class DataSericeStub implements DataService(){
//
//    @Override
//    public int[] retrieveAllData(){
//        return new inr {24,6,15};
//    }
//
//}
 //Instead of stubs we could use mocks