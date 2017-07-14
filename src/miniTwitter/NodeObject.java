package miniTwitter;

import java.util.List;
import java.util.Set;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

// Component interface
// Class: NodeObject
// Purpose: groups User and Group into a
// general interface that user can use.
// 
public interface NodeObject {
    public String getID();
    public List<Message> getMessages();
    public List<NodeObject> getChildren();
    public boolean addNodeObject(NodeObject o);
    public void addMessage(Message message);
    public void addFollower(User follower);
    public void addFollowingUser(User followingUser);
    public Set<User> getFollowers();
    public Set<User> getFollowingUsers();
    public List<User> getAllUsers();
    public DefaultMutableTreeNode getNode();
    public String toString();
}