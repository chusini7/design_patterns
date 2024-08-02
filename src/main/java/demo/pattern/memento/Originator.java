package demo.pattern.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 原发器（Originator）：创建一个备忘录对象，并且可以使用备忘录对象恢复自身的内部状态。
 * 原发器通常会在需要保存状态的时候创建备忘录对象，并在需要恢复状态的时候使用备忘录对象
 *
 * @author libiao
 */
@Setter
@Getter
public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        state = memento.getState();
    }
}