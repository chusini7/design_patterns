package demo.pattern.mediator;

import lombok.Getter;

/**
 * 同事类：用户
 *
 * @author libiao
 */
public class User {

    @Getter
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.registerUser(this);
    }

    public void sendMessage(String message) {
        chatRoom.broadcastMessage(this, message);
    }

    public void receiveMessage(User sender, String message) {
        System.out.println(sender.getName() + " say: " + message);
    }

}
