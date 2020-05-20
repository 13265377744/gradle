package haday.com.service.tree;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description:
 * @Author: dingj
 * @DATA: 2020/5/20
 * @TIME: 13:10
 */
public class text {

    public static void main(String[] args) {
        //测试方法
        Node n1 = new Node("0", "根节点", "-1", 0);
        Node n2 = new Node("01", "一级子节点", "0", 0);
        Node n3 = new Node("011", "二级子节点1", "01", 3);
        Node n4 = new Node("012", "二级子节点2", "01", 2);
        Node n5 = new Node("013", "二级子节点3", "01", 1);
        Node n6 = new Node("0131", "三级子节点1", "013", 1);
        Node n7 = new Node("0132", "三级子节点2", "013", 1);
        List<Node> nodeList = new ArrayList();
        nodeList.add(n1);
        nodeList.add(n2);
        nodeList.add(n3);
        nodeList.add(n4);
        nodeList.add(n5);
        nodeList.add(n6);
        nodeList.add(n7);
        List<Node> levelTree = getInfiniteLevelTree(nodeList);
        String json = JSONObject.toJSONString(levelTree);
        //System.out.println("levelTree========" + levelTree);
        System.out.println("json========" + json);

    }


    // 入口方法
    public static List<Node> getInfiniteLevelTree(List<Node> nodeList) {
        List<Node> list = new ArrayList<>();
        // 遍历节点列表
        for (Node node : nodeList) {
            if (node.getParentId().equals("-1")) {
                // parentID为-1（根节点）作为入口
                node.setChildren(getChildrenNode(node.getId(), nodeList));
                list.add(node);
            }
        }
        // 排序
        list.sort(new NodeOrderComparator());
        return list;
    }

    // 获取子节点的递归方法
    public static List<Node> getChildrenNode(String id, List<Node> nodeList) {
        List<Node> lists = new ArrayList<>();
        for (Node node : nodeList) {
            if (node.getParentId().equals(id)) {
                // 递归获取子节点
                node.setChildren(getChildrenNode(node.getId(), nodeList));
                lists.add(node);
            }
        }
        // 排序
        lists.sort(new NodeOrderComparator());
        return lists;
    }
}

// 节点Bean
class Node {
    private String id;
    private String name;
    private String parentId;
    private int order;
    private List<Node> children = new ArrayList<>();


    public Node(String id, String name, String parentId, int order) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Node [id=" + id + ", name=" + name + ", parentId=" + parentId + ", order=" + order + ", children="
                + children + "]";
    }


}

// 节点排序Comparator
class NodeOrderComparator implements Comparator<Node> {
    // 按照节点排序值进行排序
    public int compare(Node n1, Node n2) {
        return (n1.getOrder() < n2.getOrder() ? -1 : (n1.getOrder() == n2.getOrder() ? 0 : 1));
    }
}

