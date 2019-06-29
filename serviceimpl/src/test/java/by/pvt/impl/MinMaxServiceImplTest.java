package by.pvt.impl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class MinMaxServiceImplTest {
    MinMaxServiceImpl minMaxService;

    @org.junit.Before
    public void setUp() throws Exception {
        minMaxService = new MinMaxServiceImpl();

    }

    @org.junit.After
    public void tearDown() throws Exception {
        minMaxService = null;
    }

    @org.junit.Test
    public void findMin() {
//        List<Integer> test1=null;
//        List<Integer>
        List<Integer> test1 = List.of(3, 1, 2);
        Integer result = minMaxService.findMin(test1);
        assertEquals((Integer.valueOf(1)), result);

    }
    @org.junit.Test (expected = IllegalArgumentException.class)
    public void findMinListExep() {
//        List<Integer> test1=null;
//        List<Integer>
        List<Integer> test1 = List.of();
      minMaxService.findMin(test1);
    }
    @org.junit.Test (expected = RuntimeException.class)
    public void findMinWithNotEmptyList() {
//
        List<Integer> test1 =new ArrayList<>();
        test1.add(null);
        test1.add(null);
        test1.add(null);
        minMaxService.findMin(test1);
    }

    @org.junit.Test
    public void findMax() {
        List<Integer> list= List.of(3,4,5,6,7);
        Integer namber=minMaxService.findMax(list);
        assertEquals(Integer.valueOf(7),namber);

    }
    @org.junit.Test (expected = RuntimeException.class)
    public  void  findMaxlistExepthion(){
        List list=new ArrayList();
        minMaxService.findMax(list);
    }
    @org.junit.Test (expected = RuntimeException.class)
    public void findMaxWithNotEmptyList(){
        List<Integer> list=new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        minMaxService.findMax(list);

    }


}