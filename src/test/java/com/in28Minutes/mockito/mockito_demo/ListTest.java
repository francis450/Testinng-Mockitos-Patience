package com.in28Minutes.mockito.mockito_demo;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void test(){
        List listMock = mock(List.class);
        when(listMock.getRows() ).thenReturn(10);
        assertEquals(10, listMock.getRows());
    }

    @Test
    public void test_ReturningT_wice(){
        List listMock = mock(List.class);
        when(listMock.getRows()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.getRows());
        assertEquals(20, listMock.getRows());
    }

    @Test
    public void testGet(){
        List listMock = mock(List.class);
        //Mockhito.anyInt -> used in parameters requiring generic indices
        when(listMock.isIndexSelected(Mockito.anyInt())).thenReturn(true);
        assertEquals(true,listMock.isIndexSelected(7));
    }

}
