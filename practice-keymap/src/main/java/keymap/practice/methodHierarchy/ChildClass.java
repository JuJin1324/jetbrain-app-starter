package keymap.practice.methodHierarchy;

/**
 * Created by Yoo Ju Jin(yjj@hanuritien.com)
 * Created Date : 2019/12/25
 */
public class ChildClass extends ParentClass {

    @Override
    public void parentMethod() {
        System.out.println("Overried parentMethod.");
    }
}
