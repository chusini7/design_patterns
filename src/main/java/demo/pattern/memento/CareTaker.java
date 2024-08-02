package demo.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人（Caretaker）：负责保存备忘录对象，但是不对备忘录对象进行操作或检查。负责人只能将备忘录传递给其他对象
 *
 * @author libiao
 */
public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}