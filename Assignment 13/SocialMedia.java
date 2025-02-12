import java.util.*;

class UserNode {
    int userID;
    String name;
    int age;
    FriendNode friends; 
    UserNode next;
    public UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = null;
    }
}

class FriendNode {
    int friendID;
    FriendNode next;

    public FriendNode(int friendID) {
        this.friendID = friendID;
        this.next = null;
    }
}

public class SocialMedia {
    private UserNode head; 

    public SocialMedia() {
        head = null;
    }

    
    public void addUser(int userID, String name, int age) {
        UserNode newUser = new UserNode(userID, name, age);
        newUser.next = head;
        head = newUser;
    }

    
    public void addFriend(int userID1, int userID2) {
        UserNode user1 = findUser(userID1);
        UserNode user2 = findUser(userID2);

        if (user1 != null && user2 != null && !isFriend(user1, userID2)) {
            
            FriendNode newFriend1 = new FriendNode(userID2);
            newFriend1.next = user1.friends;
            user1.friends = newFriend1;

            FriendNode newFriend2 = new FriendNode(userID1);
            newFriend2.next = user2.friends;
            user2.friends = newFriend2;
        }
    }

    public void removeFriend(int userID1, int userID2) {
        UserNode user1 = findUser(userID1);
        UserNode user2 = findUser(userID2);

        if (user1 != null && user2 != null) {
            user1.friends = removeFriendFromList(user1.friends, userID2);
            user2.friends = removeFriendFromList(user2.friends, userID1);
        }
    }

    private FriendNode removeFriendFromList(FriendNode head, int friendID) {
        if (head == null) return null;
        if (head.friendID == friendID) {
            return head.next;
        }

        FriendNode current = head;
        while (current.next != null) {
            if (current.next.friendID == friendID) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }

        return head;
    }

    private boolean isFriend(UserNode user, int friendID) {
        FriendNode current = user.friends;
        while (current != null) {
            if (current.friendID == friendID) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void findMutualFriends(int userID1, int userID2) {
        UserNode user1 = findUser(userID1);
        UserNode user2 = findUser(userID2);

        if (user1 != null && user2 != null) {
            Set<Integer> friendsOfUser1 = new HashSet<>();
            FriendNode current = user1.friends;

            while (current != null) {
                friendsOfUser1.add(current.friendID);
                current = current.next;
            }

            current = user2.friends;
            List<Integer> mutualFriends = new ArrayList<>();
            while (current != null) {
                if (friendsOfUser1.contains(current.friendID)) {
                    mutualFriends.add(current.friendID);
                }
                current = current.next;
            }

            if (mutualFriends.isEmpty()) {
                System.out.println("No mutual friends found.");
            } else {
                System.out.println("Mutual friends: " + mutualFriends);
            }
        }
    }

    public void displayFriends(int userID) {
        UserNode user = findUser(userID);
        if (user != null) {
            FriendNode current = user.friends;
            System.out.println(user.name + "'s friends:");
            while (current != null) {
                System.out.println("User ID: " + current.friendID);
                current = current.next;
            }
        }
    }

    public UserNode findUser(int userID) {
        UserNode current = head;
        while (current != null) {
            if (current.userID == userID) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public UserNode findUser(String name) {
        UserNode current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void countFriends(int userID) {
        UserNode user = findUser(userID);
        if (user != null) {
            int count = 0;
            FriendNode current = user.friends;
            while (current != null) {
                count++;
                current = current.next;
            }
            System.out.println(user.name + " has " + count + " friends.");
        }
    }

    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 35);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);

        sm.displayFriends(1);

        sm.countFriends(1);

        sm.findMutualFriends(1, 2);

        sm.removeFriend(1, 2);

        sm.displayFriends(1);
    }

}

