class Solution {
public:
    string serialize(Node* root, unordered_map<string, int>& subtreeCount, unordered_map<string, Node*>& subtreeRoots) {
        if (!root)
            return "#";

        string serialized = to_string(root->data) + "," + serialize(root->left, subtreeCount, subtreeRoots) + "," + serialize(root->right, subtreeCount, subtreeRoots);

        if (++subtreeCount[serialized] == 2) {
            subtreeRoots[serialized] = root;
        }

        return serialized;
    }

    bool dupSub(Node* root) {
        unordered_map<string, int> subtreeCount;
        unordered_map<string, Node*> subtreeRoots;

        serialize(root, subtreeCount, subtreeRoots);

        for (const auto& entry : subtreeRoots) {
            if (entry.second->left || entry.second->right) {
                return true; // Found a duplicate subtree of size two or more
            }
        }

        return false;
    }
};