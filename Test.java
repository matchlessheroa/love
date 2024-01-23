package api_arrarya;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        Student [] students=new Student[4];
        Student s1=new Student("张三",17.7,25);
        Student s2=new Student("张三1",17.5,26);
        Student s3=new Student("张三2",17.3,29);
        Student s4=new Student("张三3",17.9,22);
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        //1,对数组进行排序,自己指定按照学生对象的什么元素进行排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //2.利用下面的sort方法
       //参数一：需要排序的数组
        //参数二：Compator比较器对象（用来指定比较规则）
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //约定，如果左边对象大于右边对象。请您返回正整数
                //约定，如果左边对象小于右边对象。请您返回负整数
                //约定，如果左边对象等于右边对象。请您返回0
//                if(o1.getHeight()>o2.getHeight()){
//                    return 1;
//                }else if (o1.getHeight()<o2.getHeight()){
//                    return -1;
//                }
//                return 0;//升序
                return Double.compare(o1.getHeight(),o2.getHeight());//效果一样
            }
        });
        System.out.println(Arrays.toString(students));

    }
}
