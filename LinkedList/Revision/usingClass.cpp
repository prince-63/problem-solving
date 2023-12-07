#include <bits/stdc++.h>
using namespace std;

// creating a node
class Node {
    public :
        int data;
        Node *next;
};

int main(void)
{
    Node *head;
    Node *one;
    Node *two;
    Node *three;

    // memory allocation of 3 node
    one = new Node();
    two = new Node();
    three = new Node();

    // assign value 
    
    one->data = 10;
    two->data = 20;
    three->data = 30;

    // linking togather
    one->next = two;
    two->next = three;
    three->next = NULL;
    head = one;

    // priting node 
    cout << "Node val : ";
    while(head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;

    return 0;
}