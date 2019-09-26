package string;

public class TrieNode {
    private char ch;
    private TrieNode[] childNodes = new TrieNode[26];

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public TrieNode[] getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(TrieNode[] childNodes) {
        this.childNodes = childNodes;
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "ch=" + ch +
                '}';
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        TrieNode[] child = root.getChildNodes();
        for (int i = 0; i < 26; i++) {
            child[i] = new TrieNode();
            child[i].setCh((char) ('a' + i));
            System.out.println(child[i]);
        }
    }
}
