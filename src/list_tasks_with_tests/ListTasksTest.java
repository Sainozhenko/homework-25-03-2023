package list_tasks_with_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {
private ListTasks listTasks;
@BeforeEach
    public void init(){
    listTasks = new ListTasks();
}
@Test
public void removeNamesLenght4_test_fourIn_twoOut(){

    List<String> actual = Arrays.asList("John","Ann","Anna","Pablo");
    List<String> expected = Arrays.asList("Ann","Pablo");
    assertEquals(expected, listTasks.remove(actual));

}
@Test
public void removeNames_test_empty(){
    assertEquals(Arrays.asList(),listTasks.remove(Arrays.asList()));
}
@Test
public void removeNames_test_noNamesLenght(){
    List<String> actual = Arrays.asList("Johnn","Ann","Annaa","Pablo");
    List<String> expected = Arrays.asList("Johnn","Ann","Annaa","Pablo");
    assertEquals(expected,listTasks.remove(actual));
}
    @Test
    public void removeNames_test_noNamesLenght4(){
        List<String> actual = Arrays.asList("Johnn","Anaa","Anna","Palo");
        List<String> expected = Arrays.asList();
        assertEquals(expected,listTasks.remove(actual));
    }
    @Test
    public void removeNamesLength4_test_fourIn_twoOut(){
        List<String> actual = Arrays.asList("John", "Pablo", "Ann", "Jack");
        List<String> expected = Arrays.asList("Pablo", "Ann");

        assertEquals(actual,listTasks.remove(expected));
    }
//    @Test
//    public void removeNames_test_empty(){
//        assertEquals(Arrays.asList(),listTasks.remove(Arrays.asList()));
//    }


    @Test
    public void removeNames_test_noNamesLength4(){
        List<String> actual = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");
        List<String> expected = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");

        assertEquals(expected,listTasks.remove(actual));
    }


    @Test
    public void when_allNamesLength4_then_returnEmptyList(){
        List<String> actual = Arrays.asList("John", "Pabl", "Annn", "Jack");
        List<String> expected = Arrays.asList();

        assertEquals(expected,listTasks.remove(actual));
    }
    @Test
    public void when_allYes(){
    List<Integer>actual = Arrays.asList(1, 2,3,4);
    List<Integer>actual1=Arrays.asList(1,2,3,4);
    List<String>expected = Arrays.asList("Yes","Yes","Yes","Yes");
    assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_allNo(){
        List<Integer>actual = Arrays.asList(2, 3,4,1);
        List<Integer>actual1=Arrays.asList(1,2,3,4);
        List<String>expected = Arrays.asList("No","No","No","No");
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_allEmptyList(){
        List<Integer>actual = Arrays.asList();
        List<Integer>actual1=Arrays.asList();
        List<String>expected = Arrays.asList();
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_Yes_No_Yes_No(){
        List<Integer>actual = Arrays.asList(1,3,2,4);
        List<Integer>actual1=Arrays.asList(1,2,2,3);
        List<String>expected = Arrays.asList("Yes","No","Yes","No");
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_No_Yes_No_Yes(){
        List<Integer>actual = Arrays.asList(2,2,4,3);
        List<Integer>actual1=Arrays.asList(1,2,2,3);
        List<String>expected = Arrays.asList("No","Yes","No","Yes");
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_All_Elemnts_Zero(){
        List<Integer>actual = Arrays.asList(0,0,0,0);
        List<Integer>actual1=Arrays.asList(0,0,0,0);
        List<String>expected = Arrays.asList("Yes","Yes","Yes","Yes");
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_All_Elemnts_Negativ(){
        List<Integer>actual = Arrays.asList(-1,-2,-3,-99);
        List<Integer>actual1=Arrays.asList(-1,-2,-3,-99);
        List<String>expected = Arrays.asList("Yes","Yes","Yes","Yes");
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_All_BigNoreElemnts(){
        List<Integer>actual = Arrays.asList(898989898,299999999);
        List<Integer>actual1= Arrays.asList(898989898,399999999);
        List<String>expected = Arrays.asList("Yes","No");
        assertEquals(expected,listTasks.compareYesNo(actual,actual1));
    }
    @Test
    public void when_all_work(){
    List<Integer>actual =Arrays.asList(1,2,3,4,5,6);
        List<Integer>expected =Arrays.asList(6,5,4,3,2,1);
        assertEquals(expected,listTasks.ints(actual));
    }
    @Test
    public void when_all_negativ(){
        List<Integer>actual =Arrays.asList(-1,-2,-3,-4,-5,-6);
        List<Integer>expected =Arrays.asList(-6,-5,-4,-3,-2,-1);
        assertEquals(expected,listTasks.ints(actual));
    }
    @Test
    public void when_all_zero(){
        List<Integer>actual =Arrays.asList(0,0,0,0);
        List<Integer>expected =Arrays.asList(-0,-0,-0,-0);
        assertEquals(expected,listTasks.ints(actual));
    }
    @Test
    public void when_all_big(){
        List<Integer>actual =Arrays.asList(993923,1986654,3232323,212121);
        List<Integer>expected =Arrays.asList(212121,3232323,1986654,993923);
        assertEquals(expected,listTasks.ints(actual));
    }

}