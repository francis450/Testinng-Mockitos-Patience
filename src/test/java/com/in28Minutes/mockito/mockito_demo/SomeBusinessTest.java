package com.in28Minutes.mockito.mockito_demo;

//import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessTest {
    @Test
    public void testFindTheGreatestFromAllData(){
        DataService dataServicemcok = mock(DataService.class);
        when(dataServicemcok.retrieveAllData()).thenReturn(new int[]{68,125,5,23,45});
        SomeBusinessImpl business = new SomeBusinessImpl(dataServicemcok);
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