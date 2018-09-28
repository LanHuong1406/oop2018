package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        Assert.assertEquals(2,Week3.max(2,-1));
        Assert.assertEquals(1,Week3.max(1,0));
        Assert.assertEquals(3,Week3.max(-1,3));
        Assert.assertEquals(2,Week3.max(2,2));
        Assert.assertEquals(0,Week3.max(-2,0));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] arr1 = {2,3,1,4,-1};
        Assert.assertEquals(-1,Week3.minOfArray(arr1));
        int[] arr2 = {0,-2,-1,4,2};
        Assert.assertEquals(-2,Week3.minOfArray(arr2));
        int[] arr3 = {3,1,0,2,4};
        Assert.assertEquals(0, Week3.minOfArray(arr3));
        int[] arr4 = {-4,-1,0,5,1};
        Assert.assertEquals(-4,Week3.minOfArray(arr4));
        int[] arr5 = {2,-1,3,-1,0};
        Assert.assertEquals(-1,Week3.minOfArray(arr5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        Assert.assertEquals("Thieu can",Week3.calculateBMI(47,1.6));
        Assert.assertEquals("Beo phi",Week3.calculateBMI(80,1.7));
        Assert.assertEquals("Thieu can",Week3.calculateBMI(40,1.5));
        Assert.assertEquals("Binh thuong",Week3.calculateBMI(50,1.6));
        Assert.assertEquals("Thua can",Week3.calculateBMI(70,1.7));
    }
}
