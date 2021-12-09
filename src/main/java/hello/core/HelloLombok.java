package hello.core;

import lombok.Getter;
import lombok.Setter;

//lombok에 의해 자동으로 getter, setter생성
@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdfa");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
