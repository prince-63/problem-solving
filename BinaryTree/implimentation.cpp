#include <iostream>
#include <queue>
using namespace std;

typedef struct node
{
    int data;
    node *left;
    node *right;

    node(int data)
    {
        this->data = data;
        left = NULL;
        right = NULL;
    }

} node;

void printData(int data)
{
    cout << data << " ";
}

// preoder traverse
// void traverse(node * root) {
//     if(root == NULL) {
//         return;
//     }

//     printData(root->data);
//     traverse(root->left);
//     traverse(root->right);
// }

// post order praverse
// void traverse(node *root) {
//     if(root == NULL) {
//         return;
//     }

//     traverse(root->left);
//     traverse(root->right);
//     printData(root->data);
// }

void traverse(node *root)
{
    if (root == NULL)
    {
        return;
    }

    traverse(root->left);
    printData(root->data);
    traverse(root->right);
}

void levelOrderTraverse(node *root)
{
    queue<node *> q;

    q.push(root);
    q.push(NULL);

    while (!q.empty())
    {
        node *temp = q.front();
        q.pop();

        if(temp == NULL) {
            cout << endl;

            if(!q.empty()) {
                q.push(NULL);
            }
        }
        else
        {
            cout << temp->data << " ";

            if (temp->left != NULL)
            {
                q.push(temp->left);
            }

            if (temp->right != NULL)
            {
                q.push(temp->right);
            }
        }
    }
}

node* buildTree(node *root) {
    int data;

    cout << "Enter a data : ";
    cin >> data;

    if(data == -1) {
        return NULL;
    }

    root = new node(data);
    cout << "left child : ";
    root->left = buildTree(root->left);
    cout << "Right child : ";
    root->right = buildTree(root->right);
}

int main()
{
    // node *root;
    // root = new node(10);
    // root->left = new node(20);
    // root->right = new node(30);
    // // second level
    // root->left->left = new node(40);
    // root->left->right = new node(50);

    // root->right->left = new node(60);
    // root->right->right = new node(70);

    // // traverse(root);
    // levelOrderTraverse(root);

    node *root;

    root = buildTree(root);
    levelOrderTraverse(root);
}