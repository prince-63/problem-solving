#include <iostream>
#include <queue>
using namespace std;

// creating list node
class node {

    public : 
        int data;
        node * left;
        node * right;

    node(int data) {
        this->data = data;
        this->left = NULL;
        this->right = NULL;
    }
};

node * BuildBinaryTree(node *root) {

    // data input
    cout << "Enter data : ";
    int data;
    cin >> data;
    root = new node(data);

    if(data == -1) {
        return NULL;
    }

    // left childs
    cout << "Enter a left child node : " << endl;
    root->left = BuildBinaryTree(root->left);
    
    // right childs
    cout << "Enter a right child node : " << endl;
    root->right = BuildBinaryTree(root->right);

    return root;
}

void levelTraversal(node *root) {
    queue<node *> q;
    q.push(root);
    q.push(NULL);

    cout << "\n\n tree is : " << endl;
    while(!q.empty()) {

        node * temp = q.front();
        q.pop();
        if(temp == NULL)  {
            cout << endl;

            if(!q.empty()) {
                q.push(NULL);
            }
        }
        else {
            cout << temp -> data << " ";
            if(temp->left) {
                q.push(temp->left);
            }

            if(temp->right) {
                q.push(temp->right);
            }
        }
    }
}

int main() {
    
    node *root = NULL;
    // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1 
    root = BuildBinaryTree(root);

    levelTraversal(root);
    return 0;
}