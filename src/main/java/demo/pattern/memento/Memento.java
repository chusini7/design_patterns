package demo.pattern.memento;

import lombok.Getter;

/**
 * 备忘录（Memento）：负责存储原发器对象的内部状态。备忘录可以保持原发器的状态的一部分或全部信息
 *
 * @author libiao
 */
@Getter
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

}