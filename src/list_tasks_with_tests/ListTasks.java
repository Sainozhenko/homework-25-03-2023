package list_tasks_with_tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTasks {
    //Есть список с именами. Написать метод.
    // Возвращающий лист без имен длиной 4
    public List<String> remove(List<String>names){
List<String> res= new ArrayList<String>();
for(String name:names){
    if(name.length()!=4){
        res.add(name);
    }
}
return res;
    }


    /*Есть два списка одинаковой длинны с целыми числами. Написать метод,
    который возвращает список с элементами Yes или No, где значение на I-том месте зависит от того ,
     равны ли элементы двух списков под номер i*/


    public List <String>compareYesNo(List<Integer>ints1,List<Integer>ints2){
        List <String> result = new ArrayList<>();
        for(int i = 0; i<ints1.size();i++){
            if(ints1.get(i)==ints2.get(i)){
                result.add("Yes");
            }else result.add("No");
        }return result;
    }

    //Написать метод который реверсирует лист возвращает список элементов целых чисел
//    в обратном порядке

    public List<Integer> ints(List<Integer>intsNoRemove){
        Collections.reverse(intsNoRemove);
        return intsNoRemove;
    }
    //Есть два класса: Address с полями String street и int houseNumber и
    // Person с полями String name и Address address. Нужно написать метод List<< Address > getAddresses(List persons)
    // то есть по списку persons метод будет возвращать список их адресов. Протестировать его.
}
