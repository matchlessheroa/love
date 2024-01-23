package api_arrarya;

public class Student implements  Comparable<Student>{
    private String name;
    private double height;
    private int age;
//指定比较规则这个方法是给sort内部使用的
    //比较者this  被比较者 o
    @Override
    public int compareTo(Student o) {
        //约定，如果左边对象大于右边对象。请您返回正整数
        //约定，如果左边对象小于右边对象。请您返回负整数
        //约定，如果左边对象等于右边对象。请您返回0
        //啊按照奈年龄升序
//        if(this.age>o.age){
//            return 1;
//        }else if(this.age<o.age){
//            return -1;
//        }
//        return 0;
       // return this.age-o.age;//升序排列
        return o.age-this.age;//降序排列
    }

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
