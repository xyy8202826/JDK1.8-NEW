package com.xyy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/27 Project: JDK1.8-NEW
 */
public class StreamMain {
    public static void main(String [] args){
        List<Integer> initData = Arrays.asList(3,6,9,2,45,78,23,56,2,3);
        //去重复值
        List<Integer> data1 = initData.stream().distinct().collect(Collectors.toList());
        System.out.println("去重复值:"+data1);
        //排序
        List<Integer> data2 = initData.stream().sorted((a,b)-> a.compareTo(b)).collect(Collectors.toList());
        System.out.println("排序:"+data2);
        //过滤(取偶数)
        List<Integer> data3 = initData.stream().filter(a-> a%2==0)
        .collect(Collectors.toList());
        System.out.println("过滤(取偶数):"+data3);
        //找一个数
        Integer value = initData.parallelStream().findAny().get();
        System.out.println("找一个数:"+value);
        //找最大值
        Integer maxValue = initData.stream().max((a,b)-> a.compareTo(b)).get();
        System.out.println("找最大值:"+maxValue);
        //判断是不是都是偶数
        boolean result = initData.stream().allMatch(a-> a%2==0);
        System.out.println("判断是不是都是偶数:"+result);
        //判断是不是有偶数
        boolean result2 = initData.stream().anyMatch(a-> a%2==0);
        System.out.println("判断是不是有偶数:"+result2);
        //跳过前(n)个元素
        List<Integer> data4 = initData.stream().skip(4).collect(Collectors.toList());
        System.out.println("跳过前(4)个元素:"+data4);
        //数值变为原来的2倍
        List<Integer> data5= initData.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println("数值变为原来的2倍:"+data5);

        collectorTest();
    }

    /**
     * Collector类方法测试
     */
    public static void collectorTest(){
        List<Employee> employees=new ArrayList();
        employees.add(new Employee("Alice","London",200));
        employees.add(new Employee("Bob","London",150));
        employees.add(new Employee("Charles","New York",160));
        employees.add(new Employee("Dorothy","Hong Kong",190));
        //分组
        //按城市进行分组：
        Map<String, List<Employee>> employeesByCity =
                employees.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(employeesByCity);
        //统计每个城市雇员数量
       Map<String,Long> numEmployeesByCity = employees.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
        System.out.println(numEmployeesByCity);
        //计算每个城市的平均销售量
        Map<String, Double> avgSalesByCity =
                employees.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.averagingInt(Employee::getSales)));
        System.out.println(avgSalesByCity);
        //分区
        Map<Boolean, List<Employee>> partitioned =
                employees.stream().collect(Collectors.partitioningBy(e -> e.getSales() > 150));
        System.out.println(partitioned);
    }
}
